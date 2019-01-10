package blockproject.bpsl.ast.statement;

import blockproject.bpsl.ast.ConstantExpr;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.expr.Expr;

public class Variable extends Statement
{
    public TypeName typeName = new TypeName();
    public Expr value;
    public ConstantExpr arrSize; //TODO : Implement array parsing

    public Variable()
    {
        super(EType.VARIABLE_DECLARATION);
    }
}