package blockproject.bpsl.ast.expr;

public class Expr
{
    public enum EType
    {
        BINARY_OPERATION,
        UNARY_OPERATION,
        FUNCTION_CALL,
        ARRAY_SUBSCRIPT,
        MEMBER_ACCESS,
        MEMBER_FUNCTION_CALL,
        PRIMARY,
        INTEGER_LITTERAL,
        FLOAT_LITTERAL,
        DOUBLE_LITTERAL,
        IDENTIFIER,
        STRING_LITTERAL,
    }
    public EType type;

    public Expr(EType t)
    {
        type = t;
    }
}