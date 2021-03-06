package blockproject.bpsl.ast.expr;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Expr
{
    public String name;
    public List<Expr> parameters = new ArrayList<>();

    public FunctionCall()
    {
        super(EType.FUNCTION_CALL);
    }
}