package blockproject.bpsl.ast.expr;

public class MemberAccess extends Expr
{
    public Expr data;
    public String name;

    public MemberAccess()
    {
        super(blockproject.bpsl.ast.expr.EType.MEMBER_ACCESS);
    }
}