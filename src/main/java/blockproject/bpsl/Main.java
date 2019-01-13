package blockproject.bpsl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.Struct.EQualifier;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.translator.Translator;
import blockproject.bpsl.visitor.ClassVisitor;
import blockproject.bpsl.visitor.ConstantExprVisitor;
import blockproject.bpsl.visitor.FunctionVisitor;
import blockproject.bpsl.visitor.StructVisitor;

public class Main
{

    private static void createInternalType(Scope sc, String name)
    {
        Struct st = new Struct();

        st.name = name;
        st.qualifier = EQualifier.NONE;
        sc.structs.put(name, st);
    }

    private static Scope baseScope()
    {
        Scope sc = new Scope();

        for (String s : Expr.BASE_TYPES)
            createInternalType(sc, s);
        return (sc);
    }

    public static void main(String[] args)
    {
        String file = null;
        String target = null;
        Translator tr = null;

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
            return;
        }
        tr = Translator.resolve(target);
        if (tr == null)
        {
            System.err.println("Unsupported translator name " + target);
            return;
        }
        try
        {
            CharStream stream = CharStreams.fromFileName(file);
            BPSLLexer lexer = new BPSLLexer(stream);
            BPSLParser parser = new BPSLParser(new CommonTokenStream(lexer));
            BPSLParser.BpslContext ctx = parser.bpsl();
            Scope sc = baseScope();
            ConstantExprVisitor constants = new ConstantExprVisitor(sc);
            constants.visit(ctx);
            StructVisitor structs = new StructVisitor(sc);
            structs.visit(ctx);
            ClassVisitor classes = new ClassVisitor(sc);
            classes.visit(ctx);
            FunctionVisitor functions = new FunctionVisitor(sc);
            functions.visit(ctx);
            tr.translate(sc);
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
