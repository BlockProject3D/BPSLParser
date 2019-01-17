package blockproject.bpsl.translator.glsl;

import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.FunctionCall;
import blockproject.bpsl.ast.expr.Expr.EType;

public class FunctionCallTranslator extends ExprTranslator {

    @Override
    public EType type() {
        return (EType.UNARY_OPERATION);
    }

    @Override
	public String translate(Expr expr) {
        FunctionCall expr2 = (FunctionCall) expr;

        return (null);
	}

}