package blockproject.bpsl.ast.expr;

public class StringLitteral extends Expr
{
    public String value;

    public StringLitteral()
    {
        super(blockproject.bpsl.ast.expr.EType.STRING_LITTERAL);
    }
}