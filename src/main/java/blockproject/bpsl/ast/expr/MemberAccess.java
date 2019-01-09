package blockproject.bpsl.ast.expr;

public class MemberAccess extends Expr
{
    public Expr data;
    public String name;

    public MemberAccess()
    {
        super(EType.MEMBER_ACCESS);
    }
}