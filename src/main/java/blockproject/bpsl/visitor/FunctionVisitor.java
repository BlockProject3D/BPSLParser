package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLBaseVisitor;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.TypeName;

public class FunctionVisitor extends BPSLBaseVisitor<Class>
{
    private Scope scope;

    public FunctionVisitor(Scope sc)
    {
        scope = sc;
    }

    public static Function parseFunction(BPSLParser.FunctionContext ctx)
    {
        Function func = new Function();
        func.typeName.name = ctx.name.getText();
        func.typeName.type = ctx.type.getText();
        for (int i = 0 ; i < ctx.functionParameter().size() ; ++i)
        {
            TypeName tn = new TypeName();
            tn.name = ctx.functionParameter(i).name.getText();
            tn.type = ctx.functionParameter(i).type.getText();
            func.parameters.add(tn);
        }
        return (func);
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
            st.attributes.add(tn);
        }

        scope.classes.put(st.name, st);
        return (st);
    }
}