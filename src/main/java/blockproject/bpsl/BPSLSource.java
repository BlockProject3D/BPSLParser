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
import blockproject.bpsl.visitor.ImportBlockVisitor;
import blockproject.bpsl.visitor.StructVisitor;

public class BPSLSource
{
    private String fileName;
    private String targetName;

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

    public BPSLSource(String f, String target)
    {
        fileName = f;
        targetName = target;
    }

    public String getTarget()
    {
        return (targetName);
    }

    public Scope parse(Scope scope) throws Exception
    {
        CharStream stream = CharStreams.fromFileName(fileName);
        BPSLLexer lexer = new BPSLLexer(stream);
        BPSLParser parser = new BPSLParser(new CommonTokenStream(lexer));
        BPSLParser.BpslContext ctx = parser.bpsl();

        ImportBlockVisitor imports = new ImportBlockVisitor(this);
        imports.visit(ctx);
        imports.importMissing(scope);
        ConstantExprVisitor constants = new ConstantExprVisitor(scope);
        constants.visit(ctx);
        StructVisitor structs = new StructVisitor(scope);
        structs.visit(ctx);
        ClassVisitor classes = new ClassVisitor(scope);
        classes.visit(ctx);
        FunctionVisitor functions = new FunctionVisitor(scope);
        functions.visit(ctx);
        return (scope);
    }

    public Scope parse() throws Exception
    {
        return (parse(baseScope()));
    }

    public void translate() throws Exception
    {
        Translator t = Translator.resolve(targetName);

        if (t == null)
        {
            System.err.println("Unsupported translator name " + targetName);
            System.exit(1);
        }
        t.translate(parse());
    }
}