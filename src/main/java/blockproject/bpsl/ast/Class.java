package blockproject.bpsl.ast;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.ast.expr.BinaryExpr;
import blockproject.bpsl.ast.expr.UnaryExpr;

public class Class
{
    public String name;
    public List<Function> members = new ArrayList<>();
    public List<TypeName> attributes = new ArrayList<>();
    
    private static final String[] OP_FUNC_NAMES_BIN = new String[]
    {
        "__mul",
        "__div",
        "__mod",
        "__add",
        "__sub",
        "__mul_eq",
        "__div_eq",
        "__mod_eq",
        "__add_eq",
        "__sub_eq",
        "__less",
        "__gt",
        "__less_eq",
        "__gt_eq",
        "__eq",
        "__not_eq",
        null,
        null,
        null,
        null,
        null,
        null,
        null
    };

    private static final String[] OP_FUNC_NAMES_UN = new String[]
    {
        null,
        "__inc",
        "__dec",
        "__negate"
    };

    public Function findFunctionByName(String name)
    {
        for (Function f : members)
        {
            if (f.typeName.name.equals(name))
                return (f);
        }
        return (null);
    }

    public TypeName findAttributeByName(String name)
    {
        for (TypeName f : attributes)
        {
            if (f.name.equals(name))
                return (f);
        }
        return (null);
    }

    public Function findBinaryOperatorFunction(BinaryExpr.EType type)
    {
        if (OP_FUNC_NAMES_BIN[type.ordinal()] == null)
            return (null);
        String fname = OP_FUNC_NAMES_BIN[type.ordinal()];
        return (findFunctionByName(fname));
    }

    public Function findUnaryOperatorFunction(UnaryExpr.EType type)
    {
        if (OP_FUNC_NAMES_UN[type.ordinal()] == null)
            return (null);
        String fname = OP_FUNC_NAMES_UN[type.ordinal()];
        return (findFunctionByName(fname));
    }
}