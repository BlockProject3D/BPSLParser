package blockproject.bpsl.ast.expr;

public class DoubleLitteral extends Expr
{
    public double value;

    public DoubleLitteral()
    {
        super(blockproject.bpsl.ast.expr.EType.DOUBLE_LITTERAL);
    }
}