package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.expr.BinaryExpr;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.Expr.EType;

public class BinaryExprTranslator extends ExprTranslator {

    @Override
    public EType type() {
        return (EType.BINARY_OPERATION);
    }

    public String translateOp(BinaryExpr.EType type)
    {
        switch (type)
        {
        case MUL:
            return ("*");
        case DIV:
            return ("/");
        case MOD:
            return ("%");
        case PLUS:
            return ("+");
        case MINUS:
            return ("-");
        case MUL_EQ:
            return ("-=");
        case DIV_EQ:
            return ("/=");
        case MOD_EQ:
            return ("%=");
        case PLUS_EQ:
            return ("+=");
        case MINUS_EQ:
            return ("-=");
        case LESS:
            return ("<");
        case GREATER:
            return (">");
        case LESS_EQ:
            return ("<=");
        case GREATER_EQ:
            return (">=");
        case EQUAL:
            return ("==");
        case NOT_EQUAL:
            return ("!=");
        case OR:
            return ("||");
        case AND:
            return ("&&");
        case BIT_SHIFT_LEFT:
            return ("<<");
        case BIT_SHIFT_RIGHT:
            return (">>");
        case BIT_AND:
            return ("&");
        case BIT_OR:
            return ("|");
        case ASSIGNMENT:
            return ("=");
        }
        return (null);
    }

    @Override
	public String translate(Scope scope, Expr expr) {
        BinaryExpr expr2 = (BinaryExpr) expr;
        String left = ExprTranslator.translateExpr(scope, expr2.left);
        String right = ExprTranslator.translateExpr(scope, expr2.right);
        String op = translateOp(expr2.optype);

		return (left + " " + op + " " + right);
	}

}