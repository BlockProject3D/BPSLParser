package blockproject.bpsl.ast.expr;

public class Identifier extends Expr
{
    public String id;

    public Identifier()
    {
        super(blockproject.bpsl.ast.expr.EType.IDENTIFIER);
    }
}