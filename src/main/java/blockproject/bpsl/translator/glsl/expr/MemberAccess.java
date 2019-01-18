package blockproject.bpsl.translator.glsl.expr;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.Struct.EQualifier;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.Expr.EType;

public class MemberAccess extends ExprTranslator {

    @Override
    public EType type() {
        return (Expr.EType.MEMBER_ACCESS);
    }

	@Override
	public String translate(Scope scope, Expr expr) {
        blockproject.bpsl.ast.expr.MemberAccess expr2 = (blockproject.bpsl.ast.expr.MemberAccess)expr;
        Object obj = scope.resolve(expr2.data.typeName);
        if (obj instanceof Struct)
        {
            Struct st = (Struct)obj;
            if (st.qualifier == EQualifier.VLAYOUT || st.qualifier == EQualifier.CONSTBUF)
                return (expr2.data.typeName + "_" + expr2.name);
            TypeName attr = st.findAttributeByName(expr2.name);
            if (attr.internalName != null)
                return (translateExpr(scope, expr2.data) + "." + attr.internalName);
            else
                return (translateExpr(scope, expr2.data) + "." + expr2.name);
        }
        else if (obj instanceof Class)
        {
            Class st = (Class)obj;
            TypeName attr = st.findAttributeByName(expr2.name);
            if (attr.internalName != null)
                return (translateExpr(scope, expr2.data) + "." + attr.internalName);
            else
                return (translateExpr(scope, expr2.data) + "." + expr2.name);
        }
		return ("");
	}

}