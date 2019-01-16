package blockproject.bpsl.ast.expr;

public class Expr
{
    public static final String[] BASE_TYPES = new String[]
    {
        "int",
        "float",
        "double",
        "uint"
    };

    public enum EType
    {
        BINARY_OPERATION,
        UNARY_OPERATION,
        FUNCTION_CALL,
        CONSTRUCTOR_CALL,
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
    public String typeName;

    public Expr(EType t)
    {
        type = t;
    }

    public boolean isBaseType()
    {
        for (String s : BASE_TYPES)
        {
            if (s.equals(typeName))
                return (true);
        }
        return (false);
    }
}