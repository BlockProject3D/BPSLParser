package blockproject.bpsl.ast.expr;

import java.util.ArrayList;
import java.util.List;

public class ConstructorCall extends Expr
{
    public List<Expr> parameters = new ArrayList<>();

    public ConstructorCall()
    {
        super(Expr.EType.CONSTRUCTOR_CALL);
    }
}