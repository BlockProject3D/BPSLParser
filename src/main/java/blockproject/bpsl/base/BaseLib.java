package blockproject.bpsl.base;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.statement.Variable;

public abstract class BaseLib
{
    public List<Variable> vars = new ArrayList<>();
    public List<Class> classes = new ArrayList<>();
    public List<Struct> structs = new ArrayList<>();
    public List<Function> funcs = new ArrayList<>();

    public abstract void setupLib();

    protected void MakeVar(String type, String name)
    {
        Variable v = new Variable();

        v.typeName.type = type;
        v.typeName.name = name;
        vars.add(v);
    }

    protected void MakeStruct(String name, TypeName[] attributes)
    {
        Struct s = new Struct();

        s.name = name;
        for (TypeName tn : attributes)
            s.attributes.add(tn);
        structs.add(s);
    }

    protected Function Function(String type, String name, String params[])
    {
        Function f = new Function();

        f.typeName.type = type;
        f.typeName.name = name;
        for (String s : params)
        {
            TypeName tn = new TypeName();
            tn.name = "##INTERNAL##";
            tn.type = s;
            f.parameters.add(tn);
        }
        return (f);
    }

    protected TypeName Attribute(String type, String name)
    {
        TypeName tn = new TypeName();

        tn.name = name;
        tn.type = type;
        return (tn);
    }

    protected void MakeClass(String name, Object[] attributes)
    {
        Class c = new Class();

        c.name = name;
        for (Object o : attributes)
        {
            if (o instanceof TypeName)
                c.attributes.add((TypeName)o);
            else if (o instanceof Function)
                c.members.add((Function)o);
        }
        classes.add(c);
    }

    protected void MakeFunction(String type, String name, String params[])
    {
        funcs.add(Function(type, name, params));
    }
}
