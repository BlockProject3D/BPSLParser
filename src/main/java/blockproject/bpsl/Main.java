package blockproject.bpsl;

public class Main
{
    public static void main(String[] args)
    {
        String file = null;
        String target = null;

        for (int i = 0 ; i < args.length ; ++i)
        {
            if (args[i].equalsIgnoreCase("-in") && i < args.length)
                file = args[i + 1];
            else if (args[i].equalsIgnoreCase("-target") && i < args.length)
                target = args[i + 1];
        }
        if (file == null || target == null)
        {
            System.err.println("USAGE <program> -in <input BPSL source file> -target <target API GLSL/HLSL/MSL/VGLSL>");
            System.exit(1);
        }
        try
        {
            new BPSLSource(file, target).translate();
        }
        catch (Exception e)
        {
            System.err.println("==========================");
            e.printStackTrace();
            System.err.println("Exception while parsing : " + e.getMessage());
            System.err.println("==========================");
		}
    }
}
