package blockproject.bpsl.ast.expr;

public class DoubleLitteral extends Expr
{
    public double value;

    public DoubleLitteral(double val)
    {
        super(EType.DOUBLE_LITTERAL);
        value = val;
        typeName = "double";
    }
}