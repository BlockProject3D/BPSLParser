package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.ConstantExpr;
import blockproject.bpsl.ast.expr.DoubleLitteral;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.FloatLitteral;
import blockproject.bpsl.ast.expr.Identifier;
import blockproject.bpsl.ast.expr.IntegerLitteral;
import blockproject.bpsl.ast.expr.Expr.EType;

public class LiteralTranslator {
    public static class Integer extends ExprTranslator {

        @Override
        public EType type() {
            return (Expr.EType.INTEGER_LITTERAL);
        }

		@Override
		public java.lang.String translate(Scope scope, Expr expr) {
			return (java.lang.String.valueOf(((IntegerLitteral)expr).value));
		}

    }

    public static class Float extends ExprTranslator
    {

        @Override
        public EType type() {
            return (Expr.EType.FLOAT_LITTERAL);
        }

        @Override
        public java.lang.String translate(Scope scope, Expr expr) {
            return (((FloatLitteral)expr).value + "f");
        }

    }

    public static class Double extends ExprTranslator
    {

        @Override
        public EType type() {
            return (Expr.EType.DOUBLE_LITTERAL);
        }

        @Override
        public java.lang.String translate(Scope scope, Expr expr) {
            return (java.lang.String.valueOf(((DoubleLitteral)expr).value));
        }

    }

    public static class String extends ExprTranslator
    {

        @Override
        public EType type() {
            return (Expr.EType.STRING_LITTERAL);
        }

        @Override
        public java.lang.String translate(Scope scope, Expr expr) {
            throw new RuntimeException("Strings are not allowed in GLSL");
        }

    }

    public static class IdentifierFucker extends ExprTranslator
    {

        @Override
        public EType type() {
            return (Expr.EType.IDENTIFIER);
        }

        @Override
        public java.lang.String translate(Scope scope, Expr expr) {
            Object val = scope.resolve(((Identifier)expr).id);
            if (val != null && val instanceof ConstantExpr)
            {
                ConstantExpr v = (ConstantExpr)val;
                if (v.type.equals("double"))
                    return (java.lang.String.valueOf(v.valueDouble));
                else if (v.type.equals("float"))
                    return (java.lang.String.valueOf(v.valueFloat) + "f");
                else if (v.type.equals("int"))
                    return (java.lang.String.valueOf(v.valueInt));
                else
                    return (v.valueStr);
            }
            return (((Identifier)expr).id);
        }

    }
}