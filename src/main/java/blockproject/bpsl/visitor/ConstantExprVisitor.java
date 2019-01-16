package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLBaseVisitor;
import blockproject.bpsl.BPSLLexer;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.ConstantExpr;

public class ConstantExprVisitor extends BPSLBaseVisitor<ConstantExpr>
{
    private Scope scope;

    public ConstantExprVisitor(Scope sc)
    {
        scope = sc;
    }

    private static int operationInt(BPSLParser.ConstantExprContext ctx)
    {
        int value0 = resolveInt(ctx.constantExpr(0));
        if (ctx.constantExpr(1) == null)
            return (-value0);
        int value1 = resolveInt(ctx.constantExpr(1));

        switch (ctx.op.getType())
        {
        case BPSLLexer.PLUS:
            return (value0 + value1);
        case BPSLLexer.MINUS:
            return (value0 - value1);
        case BPSLLexer.MUL:
            return (value0 * value1);
        case BPSLLexer.DIV:
            return (value0 / value1);
        }
        return (0);
    }

    private float operationFloat(BPSLParser.ConstantExprContext ctx)
    {
        float value0 = resolveFloat(ctx.constantExpr(0));
        if (ctx.constantExpr(1) == null)
            return (-value0);
        float value1 = resolveFloat(ctx.constantExpr(1));

        switch (ctx.op.getType())
        {
        case BPSLLexer.PLUS:
            return (value0 + value1);
        case BPSLLexer.MINUS:
            return (value0 - value1);
        case BPSLLexer.MUL:
            return (value0 * value1);
        case BPSLLexer.DIV:
            return (value0 / value1);
        }
        return (0);
    }

    private double operationDouble(BPSLParser.ConstantExprContext ctx)
    {
        double value0 = resolveDouble(ctx.constantExpr(0));
        if (ctx.constantExpr(1) == null)
            return (-value0);
        double value1 = resolveDouble(ctx.constantExpr(1));

        switch (ctx.op.getType())
        {
        case BPSLLexer.PLUS:
            return (value0 + value1);
        case BPSLLexer.MINUS:
            return (value0 - value1);
        case BPSLLexer.MUL:
            return (value0 * value1);
        case BPSLLexer.DIV:
            return (value0 / value1);
        }
        return (0);
    }

    public static int resolveInt(BPSLParser.ConstantExprContext ctx)
    {
        if (ctx.value != null)
            return (Integer.parseInt(ctx.value.getText()));
        if (ctx.constantFunctionCall() != null)
            return (0); //TODO : Handle constant function call
        if (ctx.op != null)
            return (operationInt(ctx));
        return (resolveInt(ctx.constantExpr(0)));
    }

    private float resolveFloat(BPSLParser.ConstantExprContext ctx)
    {
        if (ctx.value != null)
            return (Float.parseFloat(ctx.value.getText()));
        if (ctx.constantFunctionCall() != null)
            return (0); //TODO : Handle constant function call
        if (ctx.op != null)
            return (operationFloat(ctx));
        return (resolveFloat(ctx.constantExpr(0)));
    }

    private double resolveDouble(BPSLParser.ConstantExprContext ctx)
    {
        if (ctx.value != null)
            return (Double.parseDouble(ctx.value.getText()));
        if (ctx.constantFunctionCall() != null)
            return (0); //TODO : Handle constant function call
        if (ctx.op != null)
            return (operationDouble(ctx));
        return (resolveDouble(ctx.constantExpr(0)));
    }

    @Override
    public ConstantExpr visitConstantDefinition(BPSLParser.ConstantDefinitionContext ctx)
    {
        ConstantExpr expr = new ConstantExpr();
        expr.type = ctx.type.getText();
        expr.name = ctx.name.getText();
        switch (expr.type)
        {
        case "int":
            expr.valueInt = resolveInt(ctx.constantExpr());
            expr.valueDouble = expr.valueInt;
            expr.valueFloat = expr.valueInt;
            break;
        case "float":
            expr.valueFloat = resolveFloat(ctx.constantExpr());
            expr.valueDouble = expr.valueFloat;
            expr.valueInt = (int)expr.valueFloat;
            break;
        case "double":
            expr.valueDouble = resolveDouble(ctx.constantExpr());
            expr.valueFloat = (float)expr.valueDouble;
            expr.valueInt = (int)expr.valueDouble;
            break;
        }
        scope.constants.put(expr.name, expr);
        return (expr);
    }
}
