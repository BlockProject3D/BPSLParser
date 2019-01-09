package blockproject.bpsl.ast;

import blockproject.bpsl.ast.expr.Expr;

public class Variable
{
    public TypeName typeName = new TypeName();
    public Expr value;
}