package blockproject.bpsl.ast.expr;

import java.util.ArrayList;
import java.util.List;

public class MemberFunctionCall extends Expr
{
    public Expr data;
    public String name;
    public List<Expr> parametters = new ArrayList<>();

    public MemberFunctionCall()
    {
        super(EType.MEMBER_FUNCTION_CALL);
    }
}