package blockproject.bpsl.visitor;

import org.antlr.v4.runtime.CommonToken;

import blockproject.bpsl.BPSLBaseVisitor;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Constructor;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.statement.Variable;

public class ClassVisitor extends BPSLBaseVisitor<Class>
{
    private Scope scope;

    public ClassVisitor(Scope sc)
    {
        scope = sc;
    }

    @Override
    public Class visitClassFucker(BPSLParser.ClassFuckerContext ctx)
    {
        Class st = new Class();

        st.name = ctx.name.getText();
        for (int i = 0 ; i < ctx.attribute().size() ; ++i)
        {
            TypeName tn = new TypeName();
            tn.name = ctx.attribute(i).name.getText();
            tn.type = ctx.attribute(i).type.getText();
            if (ctx.attribute(i).constantExpr() != null)
                tn.arrSize = ConstantExprVisitor.resolveInt(ctx.attribute(i).constantExpr());
            if (scope.resolveType(tn.type) == null)
                Scope.Error(ctx, "Use of undefined type '" + tn.type + "'");
            st.attributes.add(tn);
        }
        scope.classes.put(st.name, st);
        Variable v = new Variable();
        v.typeName.name = "this";
        v.typeName.type = st.name;
        scope.variables.put("this", v);
        for (int i = 0 ; i < ctx.constructor().size() ; ++i)
        {
            Constructor crt = FunctionVisitor.parseConstructor(ctx.constructor(i), scope);
            st.constructors.add(crt);
        }
        for (int i = 0 ; i < ctx.function().size() ; ++i)
        {
            st.members.add(FunctionVisitor.parseFunction(ctx.function(i), scope));
            CommonToken t = new CommonToken(0);
            t.setText("##REMOVED##");
            ctx.function(i).name = t;
        }
        scope.variables.remove("this");
        st.internalName = StructVisitor.parseInternalString(ctx.annotation());
        scope.classes.put(st.name, st);
        return (st);
    }
}