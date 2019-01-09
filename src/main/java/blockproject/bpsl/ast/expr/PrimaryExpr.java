package blockproject.bpsl.ast.expr;

public class PrimaryExpr extends Expr
{
    private Expr expr;

    public PrimaryExpr()
    {
        super(blockproject.bpsl.ast.expr.EType.PRIMARY);
    }
}