package blockproject.bpsl.ast.expr;

public class StringLitteral extends Expr
{
    public String value;

    public StringLitteral()
    {
        super(EType.STRING_LITTERAL);
    }
}