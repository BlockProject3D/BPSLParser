package blockproject.bpsl;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main
{
    public static void main(String[] args)
    {
        String file = args[0];
        System.out.println(file);
        try {
            CharStream stream = CharStreams.fromFileName(file);
            BPSLLexer lexer = new BPSLLexer(stream);
            BPSLParser parser = new BPSLParser(new CommonTokenStream(lexer));
            ConstantExprVisitor visitor = new ConstantExprVisitor();
            visitor.visit(parser.bpsl());
        } catch (IOException e) {
            // TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
