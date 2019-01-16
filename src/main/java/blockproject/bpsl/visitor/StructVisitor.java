package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLBaseVisitor;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.TypeName;
import blockproject.bpsl.ast.Struct.EQualifier;

public class StructVisitor extends BPSLBaseVisitor<Struct>
{
    private Scope scope;

    public static String parseInternalString(BPSLParser.AnnotationContext ctx)
    {
        if (ctx == null)
            return (null);
        if (ctx.name.getText().equals("Internal"))
            return (ctx.value.getText());
        return (null);
    }

    public StructVisitor(Scope sc)
    {
        scope = sc;
    }

    @Override
    public Struct visitStructure(BPSLParser.StructureContext ctx)
    {
        Struct st = new Struct();

        st.name = ctx.name.getText();
        st.qualifier = EQualifier.NONE;
        if (ctx.qualifier() != null)
        {
            if (ctx.qualifier().QUALIFIER_CBUF() != null)
                st.qualifier = EQualifier.CONSTBUF;
            else
                st.qualifier = EQualifier.VLAYOUT;
        }
        for (int i = 0 ; i < ctx.attribute().size() ; ++i)
        {
            TypeName tn = new TypeName();
            tn.name = ctx.attribute(i).name.getText();
            tn.type = ctx.attribute(i).type.getText();
            if (ctx.attribute(i).constantExpr() != null)
                tn.arrSize = ConstantExprVisitor.resolveInt(ctx.attribute(i).constantExpr());
            if (scope.resolveType(tn.type) == null)
                Scope.Error(ctx, "Use of undefined type '" + tn.type + "'");
            st.attributes.add(tn);
        }
        st.internalName = parseInternalString(ctx.annotation());
        scope.structs.put(st.name, st);
        return (st);
    }
}