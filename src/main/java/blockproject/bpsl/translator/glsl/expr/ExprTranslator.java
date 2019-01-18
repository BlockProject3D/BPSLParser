package blockproject.bpsl.translator.glsl.expr;

import java.util.HashMap;
import java.util.Map;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.expr.Expr;

public abstract class ExprTranslator
{
    private static Map<Expr.EType, ExprTranslator> translators = new HashMap<>();

    public abstract Expr.EType type();
    public abstract String translate(Scope scope, Expr expr);

    public static void register(ExprTranslator t)
    {
        translators.put(t.type(), t);
    }

    public static ExprTranslator getTranslator(Expr.EType type)
    {
        if (translators.containsKey(type))
            return (translators.get(type));
        return (null);
    }

    public static String translateExpr(Scope scope, Expr expr)
    {
        ExprTranslator tr = getTranslator(expr.type);
        
        if (tr == null)
            return ("");
        return (tr.translate(scope, expr));
    }

    static
    {
        register(new BinaryExprTranslator());
        register(new UnaryExprTranslator());
        register(new FunctionCallTranslator());
        register(new ConstructorCallTranslator());
        register(new LiteralTranslator.Integer());
        register(new LiteralTranslator.Float());
        register(new LiteralTranslator.Double());
        register(new LiteralTranslator.String());
        register(new LiteralTranslator.IdentifierFucker());
    }
}