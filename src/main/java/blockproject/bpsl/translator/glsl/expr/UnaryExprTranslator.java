package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.ast.expr.UnaryExpr;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.Expr.EType;

public class UnaryExprTranslator extends ExprTranslator {

    @Override
    public EType type() {
        return (EType.UNARY_OPERATION);
    }

    public String translateOp(UnaryExpr.EType type)
    {
        switch (type)
        {
        case NEGATE:
            return ("-");
        case NOT:
            return ("!");
        case INCREMENT:
            return ("++");
        case DECREMENT:
            return ("--");
        }
       return (null);
    }

    @Override
	public String translate(Scope scope, Expr expr) {
        UnaryExpr expr2 = (UnaryExpr) expr;
        String left = ExprTranslator.translateExpr(scope, expr2.left);
        String op = translateOp(expr2.optype);

		return (op + " " + left);
	}

}