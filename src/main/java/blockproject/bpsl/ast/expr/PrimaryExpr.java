package blockproject.bpsl.ast.expr;

public class PrimaryExpr extends Expr
{
    public Expr expr;

    public PrimaryExpr()
    {
        super(EType.PRIMARY);
    }
}