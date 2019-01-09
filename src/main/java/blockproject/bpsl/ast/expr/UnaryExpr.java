package blockproject.bpsl.ast.expr;

public class UnaryExpr extends Expr
{
    public enum EType
    {
        NOT,
        INCREMENT,
        DECREMENT,
        NEGATE
    }

    public Expr left;
    public EType optype;

    public UnaryExpr()
    {
        super(Expr.EType.UNARY_OPERATION);
    }
}