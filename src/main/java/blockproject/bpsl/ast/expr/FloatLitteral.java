package blockproject.bpsl.ast.expr;

public class FloatLitteral extends Expr
{
    public float value;

    public FloatLitteral(float val)
    {
        super(EType.FLOAT_LITTERAL);
        value = val;
    }
}