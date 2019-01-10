package blockproject.bpsl;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.ConstantExpr;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.statement.Variable;

public class Scope
{
    public Map<String, ConstantExpr> constants = new HashMap<>();
    public Map<String, Struct> structs = new HashMap<>();
    public Map<String, Class> classes = new HashMap<>();
    public Map<String, Function> functions = new HashMap<>();
    public Map<String, Variable> variables = new HashMap<>();

    public Function curFunction = null;

    public static void Error(ParserRuleContext ctx, String msg)
    {
        String m = "Error at line " + ctx.getStart().getLine() + ": " + msg;
        throw new RuntimeException(m);
    }

    public static void Warning(ParserRuleContext ctx, String msg)
    {
        String m = "Warning at line " + ctx.getStart().getLine() + ": " + msg;
        System.err.println(m);
    }

    public Scope()
    {
    }

    public Scope(Scope sc)
    {
        constants = sc.constants;
        structs = sc.structs;
        classes = sc.classes;
        functions = sc.functions;
        variables = sc.variables;
    }

    public Object resolveType(String name)
    {
        if (structs.containsKey(name))
            return (structs.get(name));
        if (classes.containsKey(name))
            return (classes.get(name));
        return (null);
    }

    public Object resolve(String name)
    {
        if (constants.containsKey(name))
            return (constants.get(name));
        if (structs.containsKey(name))
            return (structs.get(name));
        if (classes.containsKey(name))
            return (classes.get(name));
        if (functions.containsKey(name))
            return (functions.get(name));
        if (variables.containsKey(name))
            return (variables.get(name));
        if (curFunction != null)
        {
            for (TypeName par : curFunction.parameters)
            {
                if (par.name.equals(name))
                    return (par);
            }    
        }
        return (null);
    }

    public String resolveTypeName(String name)
    {
        if (constants.containsKey(name))
            return (constants.get(name).type);
        if (structs.containsKey(name))
            return (name);
        if (classes.containsKey(name))
            return (name);
        if (functions.containsKey(name))
            return (functions.get(name).typeName.type);
        if (variables.containsKey(name))
            return (variables.get(name).typeName.type);
        return (null);
    }
}
