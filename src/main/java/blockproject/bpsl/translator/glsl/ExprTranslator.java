package blockproject.bpsl.translator.glsl;

import java.util.HashMap;
import java.util.Map;

import blockproject.bpsl.ast.expr.Expr;

public abstract class ExprTranslator
{
    private static Map<Expr.EType, ExprTranslator> translators = new HashMap<>();

    public abstract Expr.EType type();
    public abstract String translate(Expr expr);

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

    static
    {

    }
}