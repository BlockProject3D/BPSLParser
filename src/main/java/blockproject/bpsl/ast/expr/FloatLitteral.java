package blockproject.bpsl.ast.expr;

public class FloatLitteral extends Expr
{
    public float value;

    public FloatLitteral()
    {
        super(blockproject.bpsl.ast.expr.EType.FLOAT_LITTERAL);
    }
}