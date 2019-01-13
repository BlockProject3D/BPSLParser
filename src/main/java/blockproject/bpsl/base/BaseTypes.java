package blockproject.bpsl.base;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.statement.Variable;

public class BaseTypes
{
    public static String[] BASE_TYPES_LIST;
    private static List<Object> BASE_TYPES = new ArrayList<>();

    public static Scope newScope()
    {
        Scope scope = new Scope();

        for (Object o : BASE_TYPES)
        {
            if (o instanceof Class)
                scope.classes.put(((Class)o).name, (Class)o);
            else if (o instanceof Struct)
                scope.structs.put(((Struct)o).name, (Struct)o);
            else if (o instanceof Variable)
                scope.variables.put(((Variable)o).typeName.name, (Variable)o);
        }
        return (scope);
    }

    private static void addLib(java.lang.Class<? extends BaseLib> cl)
    {
        BaseLib bl = cl.newInstance();

        for (Variable v : bl.vars)
            BASE_TYPES.add(v);
        for (Struct v : bl.vars)
            BASE_TYPES.add(v);
        for (Class v : bl.vars)
            BASE_TYPES.add(v);
    }

    static
    {

    }
}
