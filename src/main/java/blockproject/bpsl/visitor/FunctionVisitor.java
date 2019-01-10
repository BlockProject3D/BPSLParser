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

        sc.curFunction = func;
        func.typeName.name = ctx.name.getText();
        func.typeName.type = ctx.type.getText();
        if (scope.resolveType(func.typeName.type) == null)
            Scope.Error(ctx, "Use of undefined type '" + func.typeName.type + "'");
        for (int i = 0 ; i < ctx.functionParameter().size() ; ++i)
        {
            TypeName tn = new TypeName();
            tn.name = ctx.functionParameter(i).name.getText();
            tn.type = ctx.functionParameter(i).type.getText();
            if (scope.resolveType(tn.type) == null)
                Scope.Error(ctx, "Use of undefined type '" + tn.type + "'");
            func.parameters.add(tn);
        }
        for (int i = 0 ; i < ctx.compoundStatement().statement().size() ; ++i)
            func.statements.add(StatementParser.parseStatement(ctx.compoundStatement().statement(i), sc));
        sc.curFunction = null;
        return (func);
    }

    @Override
    public Function visitFunction(BPSLParser.FunctionContext ctx)
    {
        if (ctx.name.getText().equals("##REMOVED##"))
            return (null);
        Function fc = parseFunction(ctx, scope);
        
        scope.functions.put(fc.typeName.name, fc);
        return (fc);
    }
}