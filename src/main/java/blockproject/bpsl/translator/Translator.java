package blockproject.bpsl.translator;

import java.util.HashMap;
import java.util.Map;

import blockproject.bpsl.Scope;

public abstract class Translator
{
    private static Map<String, Translator> map = new HashMap<>();

    public abstract void translate(Scope globalScope);
    public abstract String name();

    public static void register(Translator t)
    {
        map.put(t.name(), t);
    }

    public static Translator resolve(String name)
    {
        if (map.containsKey(name))
            return (map.get(name));
        return (null);
    }

    static
    {
        register(new GLSLTranslator());
    }
}
