package blockproject.bpsl.ast.expr;

public class Identifier extends Expr
{
    public String id;

    public Identifier(String idn)
    {
        super(EType.IDENTIFIER);
        id = idn;
    }
}