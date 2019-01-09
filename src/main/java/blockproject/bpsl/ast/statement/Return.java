package blockproject.bpsl.ast.statement;

import blockproject.bpsl.ast.expr.Expr;

public class Return extends Statement
{
    public Expr value;

    public Return()
    {
        super(EType.RETURN);
    }
}