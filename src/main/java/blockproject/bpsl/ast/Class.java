package blockproject.bpsl.ast;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.expr.BinaryExpr;
import blockproject.bpsl.ast.expr.UnaryExpr;

public class Class
{
    public String name;
    public List<Function> members = new ArrayList<>();
    public List<Constructor> constructors = new ArrayList<>();
    public List<TypeName> attributes = new ArrayList<>();

    public String internalName;
    
    private static final String[] OP_FUNC_NAMES_BIN = new String[]
    {
        "operator*",
        "operator/",
        "operator%",
        "operator+",
        "operator-",
        "operator*=",
        "operator/=",
        "operator%=",
        "operator+=",
        "operator-=",
        "operator<",
        "operator>",
        "operator<=",
        "operator>=",
        "operator==",
        "operator!=",
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
        "operator++",
        "operator--",
        "operator-"
    };

    public Function findFunctionByName(String name, List<TypeName> params)
    {
        for (Function f : members)
        {
            if (f.typeName.name.equals(name) && Scope.areParamsIdentical(f.parameters, params))
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

    public Function findBinaryOperatorFunction(BinaryExpr.EType type, List<TypeName> params)
    {
        if (OP_FUNC_NAMES_BIN[type.ordinal()] == null)
            return (null);
        String fname = OP_FUNC_NAMES_BIN[type.ordinal()];
        return (findFunctionByName(fname, params));
    }

    public Function findUnaryOperatorFunction(UnaryExpr.EType type)
    {
        if (OP_FUNC_NAMES_UN[type.ordinal()] == null)
            return (null);
        String fname = OP_FUNC_NAMES_UN[type.ordinal()];
        List<TypeName> l = new ArrayList<>();
        return (findFunctionByName(fname, l));
    }

    public Constructor fincConstructor(List<TypeName> params)
    {
        for (Constructor c : constructors)
        {
            if (Scope.areParamsIdentical(c.parameters, params))
                return (c);
        }
        return (null);
    }
}