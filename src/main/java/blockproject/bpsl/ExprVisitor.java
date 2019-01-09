package blockproject.bpsl;

public class ExprVisitor extends BPSLBaseVisitor<Void>
{
    private String binOperation(BPSLParser.ExprContext ctx)
    {
        String v0 = resolveExpr(ctx.expr(0));
        String v1 = resolveExpr(ctx.expr(1));

        return (v0 + " " + ctx.op.getText() + " " + v1);
    }

    private String unOperation(BPSLParser.ExprContext ctx)
    {
        String v0 = resolveExpr(ctx.expr(0));

        return (ctx.op.getText() + v0);
    }

    private String resolveExpr(BPSLParser.ExprContext ctx)
    {
        if (ctx.op != null && ctx.expr(1) != null)
            return (binOperation(ctx));
        else if (ctx.op != null && ctx.expr(1) == null)
            return (unOperation(ctx));
        else if (ctx.IDENTIFIER() != null)
            return (ctx.IDENTIFIER().getText());
        else if (ctx.L_DOUBLE() != null)
            return (ctx.L_DOUBLE().getText());
        else if (ctx.L_FLOAT() != null)
            return (ctx.L_FLOAT().getText());
        else if (ctx.L_INT() != null)
            return (ctx.L_INT().getText());
        else if (ctx.L_STRING() != null)
            return (ctx.L_STRING().getText());
        return (resolveExpr(ctx.expr(0)));
    }

    @Override
    public Void visitFunction(BPSLParser.FunctionContext ctx)
    {
        System.out.println("test");
        return visitChildren(ctx);
    }

    @Override
    public Void visitStatement(BPSLParser.StatementContext ctx)
    {
        if (ctx.expr() != null)
        {
            String str = resolveExpr(ctx.expr());
            System.out.println(str);
        }
        return (visitChildren(ctx));
    }
}
