package blockproject.bpsl.ast.expr;

public class ArraySubscript extends Expr
{
    public Expr array;
    public Expr index;

    public ArraySubscript()
    {
        super(EType.ARRAY_SUBSCRIPT);
    }
}