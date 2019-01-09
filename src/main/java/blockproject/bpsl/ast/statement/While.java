package blockproject.bpsl.ast.statement;

import blockproject.bpsl.ast.expr.Expr;

public class While extends Statement
{
    public Expr condition;
    public Statement statement;

    public While()
    {
        super(EType.WHILE);
    }
}