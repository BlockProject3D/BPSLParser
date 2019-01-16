package blockproject.bpsl.translator;

import java.util.Map;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.Struct.EQualifier;

public class GLSLTranslator extends Translator {

    private void convertVLayout(Struct st)
    {
        String res = "";

        for (int i = 0 ; i < st.attributes.size() ; ++i)
        {
            String line = "layout (location = " + i + ") in " + st.attributes.get(i).type + " " + st.name + "_" + st.attributes.get(i).name + ";\n";
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
            res += "\t" + attr.type + " " + attr.name + ";\n";
        res += "};\n";
        System.out.println(res);
    }

    /*private String convertExpr(Expr expr)
    {
        String res = "";

        switch (expr.type)
        {
        case BINARY_OPERATION:
            
            break;
        case UNARY_OPERATION:
            
            break;
        case FUNCTION_CALL:
            break;
        case ARRAY_SUBSCRIPT:
            
            break;
        case MEMBER_ACCESS:
            
            break;
        case MEMBER_FUNCTION_CALL:
            
            break;
        case PRIMARY:
            
            break;
        case INTEGER_LITTERAL:
            
            break;
        case FLOAT_LITTERAL:
            
            break;
        case DOUBLE_LITTERAL:
            
            break;
        case IDENTIFIER:
            
            break;
        case STRING_LITTERAL:
            
            break;
        }
    }

    private void convertStatement(Statement st, String init)
    {
        String res = init;

        switch (st.type)
        {
        case IF:
            break;
        case FOR:
            break;
        case WHILE:
            break;
        case COMPOUND:
            break;
        case VARIABLE_DECLARATION:
            break;
        case EXPRESSION:
            break;
        case RETURN:
            break;
        }
    }*/

    private void convertFunction(Function fc)
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
        //for (Statement st : fc.statements)
        //    convertStatement(st, "\t");
        res += "}\n";
        System.out.println(res);
    }
    
    @Override
    public void translate(Scope globalScope) {
        for (Map.Entry<String, Struct> entry : globalScope.structs.entrySet())
            convertStruct(entry.getValue());
        for (Map.Entry<String, Function> entry : globalScope.functions.entrySet())
            convertFunction(entry.getValue());
    }

    @Override
    public String name() {
		return ("GLSL");
	}

}