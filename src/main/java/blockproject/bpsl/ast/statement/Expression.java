package blockproject.bpsl.ast.statement;

import blockproject.bpsl.ast.expr.Expr;

public class Expression extends Statement
{
    public Expr expr;

    public Expression()
    {
        super(Statement.EType.EXPRESSION);
    }
}