package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLBaseVisitor;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.TypeName;

public class FunctionVisitor extends BPSLBaseVisitor<Function>
{
    private Scope scope;

    public FunctionVisitor(Scope sc)
    {
        scope = sc;
    }

    public static Function parseFunction(BPSLParser.FunctionContext ctx, Scope scope)
    {
        Scope sc = new Scope(scope);
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
        for (int i = 0 ; i < ctx.compoundStatement().statement().size() ; ++i)
            func.statements.add(StatementParser.parseStatement(ctx.compoundStatement().statement(i), sc));
        return (func);
    }

    @Override
    public Function visitFunction(BPSLParser.FunctionContext ctx)
    {
        Function fc = parseFunction(ctx, scope);
        
        scope.functions.put(fc.typeName.name, fc);
        return (fc);
    }
}