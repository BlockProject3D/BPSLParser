package blockproject.bpsl.ast.statement;

import blockproject.bpsl.ast.expr.Expr;

public class If extends Statement
{
    public Expr condition;
    public Statement statement;

    public If()
    {
        super(EType.IF);
    }
}