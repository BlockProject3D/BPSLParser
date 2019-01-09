package blockproject.bpsl.ast.expr;

public class StringLitteral extends Expr
{
    public String value;

    public StringLitteral(String val)
    {
        super(EType.STRING_LITTERAL);
        value = val;
    }
}