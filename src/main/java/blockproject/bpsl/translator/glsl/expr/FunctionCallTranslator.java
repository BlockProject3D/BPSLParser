package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.FunctionCall;
import blockproject.bpsl.ast.expr.Expr.EType;
import blockproject.bpsl.translator.glsl.SignatureGenerator;

public class FunctionCallTranslator extends ExprTranslator {

    @Override
    public EType type() {
        return (EType.FUNCTION_CALL);
    }

    private String genParStringInternal(Scope scope, Function fc, FunctionCall call)
    {
        String str = SignatureGenerator.sign(fc) + "(";
        String pars = fc.internalName.substring(fc.internalName.indexOf("(") + 1, fc.internalName.length() - 1);

        for (int i = 0 ; i < fc.parameters.size() ; ++i)
            pars = pars.replace("$" + fc.parameters.get(i).name, translateExpr(scope, call.parameters.get(i)));
        str += pars + ")";
        return (str);
    }

    @Override
	public String translate(Scope scope, Expr expr) {
        FunctionCall expr2 = (FunctionCall) expr;
        Function fc = (Function) scope.resolve(expr2.name);
        if (fc.internalName != null)
            return (genParStringInternal(scope, fc, expr2));
        String str = SignatureGenerator.sign(fc) + "(";

        for (int i = 0 ; i < expr2.parameters.size() ; ++i)
        {
            String par = translateExpr(scope, expr2.parameters.get(i));
            if (i != expr2.parameters.size() - 1)
                str += par + ", ";
            else
                str += par;
        }
        str += ")";
        return (str);
	}

}