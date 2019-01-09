package blockproject.bpsl.ast.statement;

public class Statement
{
    public enum EType
    {
        IF,
        FOR,
        WHILE,
        COMPOUND,
        VARIABLE_DECLARATION,
        EXPRESSION,
        RETURN
    }

    public EType type;

    public Statement(EType t)
    {
        type = t;
    }
}