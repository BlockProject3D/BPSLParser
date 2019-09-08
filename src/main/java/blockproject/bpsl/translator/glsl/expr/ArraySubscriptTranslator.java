package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.expr.ArraySubscript;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.Expr.EType;

public class ArraySubscriptTranslator extends ExprTranslator {

    @Override
    public EType type() {
        return (Expr.EType.ARRAY_SUBSCRIPT);
    }

	@Override
	public String translate(Scope scope, Expr expr) {
        ArraySubscript expr2 = (ArraySubscript)expr;
        /*Object obj = scope.resolve(expr2.array.typeName);
        if (obj instanceof Class)
            System.out.println("This is an amazing Test !");*/
		return (translateExpr(scope, expr2.array) + "[" + translateExpr(scope, expr2.index) + "]");
	}

}