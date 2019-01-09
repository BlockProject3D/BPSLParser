package blockproject.bpsl.ast.expr;

public class FloatLitteral extends Expr
{
    public float value;

    public FloatLitteral()
    {
        super(EType.FLOAT_LITTERAL);
    }
}