package blockproject.bpsl.ast.statement;

import blockproject.bpsl.ast.expr.Expr;

public class For extends Statement
{
    public Expr init;
    public Expr condition;
    public Expr end;
    public Statement statement;

    public For()
    {
        super(EType.FOR);
    }
}