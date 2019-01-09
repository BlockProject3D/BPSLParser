package blockproject.bpsl.ast.expr;

public class IntegerLitteral extends Expr
{
    public int value;

    public IntegerLitteral(int val)
    {
        super(EType.INTEGER_LITTERAL);
        value = val;
    }
}