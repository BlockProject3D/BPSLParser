package blockproject.bpsl.ast.expr;

public class DoubleLitteral extends Expr
{
    public double value;

    public DoubleLitteral()
    {
        super(EType.DOUBLE_LITTERAL);
    }
}