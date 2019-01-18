package blockproject.bpsl.translator.glsl;

import blockproject.bpsl.ast.Constructor;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.TypeName;

public class SignatureGenerator
{
    public static String sign(Function fc)
    {
        if (fc.internalName != null)
            return (fc.internalName.substring(0, fc.internalName.indexOf("(")));
        return (fc.typeName.name);
    }

    public static String sign(String classname, Constructor c)
    {
        if (c.internalName != null)
            return (c.internalName.substring(0, c.internalName.indexOf("(")));
        String res = classname + "_create";

        for (TypeName tn : c.parameters)
            res += tn.type;
        res += c.parameters.size();
        return (res);
    }

    public static String sign(String classname, Function fc)
    {
        if (fc.internalName != null)
            return (fc.internalName.substring(0, fc.internalName.indexOf("(")));
        String res = classname + "_" + fc.typeName.name;

        for (TypeName tn : fc.parameters)
            res += tn.type;
        res += fc.parameters.size();
        return (res);
    }
}
