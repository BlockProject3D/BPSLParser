package blockproject.bpsl.ast.expr;

public class BinaryExpr extends Expr
{
    public enum EType
    {
        MUL,
        DIV,
        MOD,
        PLUS,
        MINUS,
        MUL_EQ,
        DIV_EQ,
        MOD_EQ,
        PLUS_EQ,
        MINUS_EQ,
        LESS,
        GREATER,
        LESS_EQ,
        GREATER_EQ,
        EQUAL,
        NOT_EQUAL,
        OR,
        AND,
        BIT_SHIFT_LEFT,
        BIT_SHIFT_RIGHT,
        BIT_AND,
        BIT_OR,
        ASSIGNMENT
    }

    public Expr left;
    public Expr right;
    public EType optype;

    public BinaryExpr()
    {
        super(Expr.EType.BINARY_OPERATION);
    }
}
