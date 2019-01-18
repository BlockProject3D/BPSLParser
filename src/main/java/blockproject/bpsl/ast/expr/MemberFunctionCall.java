package blockproject.bpsl.ast.expr;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Function;

public class MemberFunctionCall extends Expr
{
    public Expr data;
    public String name;
    public List<Expr> parameters = new ArrayList<>();
    public Class linkClass;
    public Function linkCrt;

    public MemberFunctionCall()
    {
        super(EType.MEMBER_FUNCTION_CALL);
    }
}