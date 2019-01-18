package blockproject.bpsl.ast.expr;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Constructor;

public class ConstructorCall extends Expr
{
    public List<Expr> parameters = new ArrayList<>();
    public Class linkClass;
    public Constructor linkCrt;

    public ConstructorCall()
    {
        super(Expr.EType.CONSTRUCTOR_CALL);
    }
}