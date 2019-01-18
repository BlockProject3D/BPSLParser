package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Constructor;
import blockproject.bpsl.ast.expr.ConstructorCall;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.Expr.EType;
import blockproject.bpsl.translator.glsl.SignatureGenerator;

public class ConstructorCallTranslator extends ExprTranslator {

    @Override
    public EType type() {
        return (EType.CONSTRUCTOR_CALL);
    }

    private String genParStringInternal(Scope scope, Constructor fc, ConstructorCall call)
    {
        String str = SignatureGenerator.sign(call.typeName, fc) + "(";
        String pars = fc.internalName.substring(fc.internalName.indexOf("("), fc.internalName.length() - 1);

        for (int i = 0 ; i < fc.parameters.size() ; ++i)
            pars = pars.replace("$" + fc.parameters.get(i).name, translateExpr(scope, call.parameters.get(i)));
        str += pars + ")";
        return (str);
    }

    @Override
	public String translate(Scope scope, Expr expr) {
        ConstructorCall expr2 = (ConstructorCall) expr;
        if (expr2.linkCrt.internalName != null)
            return (genParStringInternal(scope, expr2.linkCrt, expr2));
        String str = SignatureGenerator.sign(expr2.typeName, expr2.linkCrt) + "(";

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