package blockproject.bpsl.translator;

import java.util.Map;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.Struct.EQualifier;
import blockproject.bpsl.ast.statement.Compound;
import blockproject.bpsl.ast.statement.Expression;
import blockproject.bpsl.ast.statement.For;
import blockproject.bpsl.ast.statement.If;
import blockproject.bpsl.ast.statement.Return;
import blockproject.bpsl.ast.statement.Statement;
import blockproject.bpsl.ast.statement.Variable;
import blockproject.bpsl.ast.statement.While;
import blockproject.bpsl.translator.glsl.expr.ExprTranslator;

public class GLSLTranslator extends Translator {

    private void convertVLayout(Struct st)
    {
        String res = "";

        for (int i = 0 ; i < st.attributes.size() ; ++i)
        {
            String line = null;
            if (st.attributes.get(i).arrSize > 0)
                line = "layout (location = " + i + ") in " + st.attributes.get(i).type + " " + st.name + "_" + st.attributes.get(i).name + "[" + st.attributes.get(i).arrSize + "];\n";
            else
                line = "layout (location = " + i + ") in " + st.attributes.get(i).type + " " + st.name + "_" + st.attributes.get(i).name + ";\n";
            res += line;
        }
        System.out.println(res);
    }

    private void convertStruct(Struct st)
    {
        String res = "";

        if (Scope.isScalarType(st.name))
            return;
        if (st.qualifier == EQualifier.VLAYOUT)
        {
            convertVLayout(st);
            return;
        }
        if (st.qualifier == EQualifier.CONSTBUF)
            res += "layout (std140) uniform ";
        else
            res += "struct ";
        res += st.name + "\n";
        res += "{\n";
        for (TypeName attr : st.attributes)
        {
            if (attr.arrSize > 0)
                res += "\t" + attr.type + " " + attr.name + "[" + attr.arrSize + "];\n";
            else
                res += "\t" + attr.type + " " + attr.name + ";\n";
        }
        res += "};\n";
        System.out.println(res);
    }

    private String convertVarDec(Scope scope, Variable v)
    {
        Object obj = scope.resolve(v.typeName.type);
        String type = v.typeName.type;

        if (obj instanceof Struct)
        {
            Struct st = (Struct)obj;
            if (st.internalName != null)
                type = st.internalName;
        }
        else if (obj instanceof Class)
        {
            Class st = (Class)obj;
            if (st.internalName != null)
                type = st.internalName;
        }
        if (v.typeName.arrSize > 0)
            return (type + " " + v.typeName.name + "[" + v.typeName.arrSize + "];");
        else
        {
            if (v.value != null)
                return (type + " " + v.typeName.name + " = " + ExprTranslator.translateExpr(scope, v.value) + ";");
            else
            return (type + " " + v.typeName.name + ";");
        }
    }

    private void convertStatement(Scope scope, Statement st, String init)
    {
        switch (st.type)
        {
        case IF:
            System.out.println(init + "if (" + ExprTranslator.translateExpr(scope, ((If)st).condition) + ")");
            convertStatement(scope, st, init + "\t");
            break;
        case FOR:
            System.out.println(init + "for (" + ExprTranslator.translateExpr(scope, ((For)st).init)
                + "; " + ExprTranslator.translateExpr(scope, ((For)st).condition)
                + "; " + ExprTranslator.translateExpr(scope, ((For)st).end) + ")");
            convertStatement(scope, st, init + "\t");
            break;
        case WHILE:
            System.out.println(init + "while (" + ExprTranslator.translateExpr(scope, ((While)st).condition) + ")");
            convertStatement(scope, st, init + "\t");
            break;
        case COMPOUND:
            System.out.println(init + "{");
            for (Statement ss : ((Compound)st).statements)
                convertStatement(scope, st, init + "\t");
            System.out.println(init + "}");
            break;
        case VARIABLE_DECLARATION:
            System.out.println(init + convertVarDec(scope, (Variable)st));
            break;
        case EXPRESSION:
            System.out.println(init + ExprTranslator.translateExpr(scope, ((Expression)st).expr) + ";");
            break;
        case RETURN:
            System.out.println(init + "return " + ExprTranslator.translateExpr(scope, ((Return)st).value) + ";");
            break;
        }
    }

    private void convertFunction(Scope scope, Function fc)
    {
        String res = fc.typeName.type + " " + fc.typeName.name + "(";

        for (int i = 0 ; i < fc.parameters.size() ; ++i)
        {
            TypeName tn = fc.parameters.get(i);
            if (i != fc.parameters.size())
                res += tn.type + " " + tn.name + ", ";
            else
                res += tn.type + " " + tn.name;
        }
        res += ")\n";
        res += "{\n";
        System.out.println(res);
        for (Statement st : fc.statements)
            convertStatement(scope, st, "\t");
        System.out.println("}");
    }
    
    @Override
    public void translate(Scope globalScope) {
        for (Map.Entry<String, Struct> entry : globalScope.structs.entrySet())
            convertStruct(entry.getValue());
        for (Map.Entry<String, Function> entry : globalScope.functions.entrySet())
            convertFunction(globalScope, entry.getValue());
    }

    @Override
    public String name() {
		return ("GLSL");
	}

}