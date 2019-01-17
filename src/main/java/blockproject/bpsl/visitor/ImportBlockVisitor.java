package blockproject.bpsl.visitor;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.BPSLBaseVisitor;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.BPSLSource;
import blockproject.bpsl.Scope;

public class ImportBlockVisitor extends BPSLBaseVisitor<BPSLSource>
{
    private List<BPSLSource> res = new ArrayList<>();

    private BPSLSource parent;

    public ImportBlockVisitor(BPSLSource p)
    {
        parent = p;
    }

    @Override
    public BPSLSource visitImportBlock(BPSLParser.ImportBlockContext ctx)
    {
        BPSLSource src;

        if (ctx.userImport() != null)
        {
            String name = ctx.userImport().name.getText();
            name = name.substring(1, name.length() - 1);
            src = new BPSLSource("./" + name + ".bpsl", parent.getTarget());
        }
        else
        {
            String name = ctx.sysImport().name.getText();
            name = name.substring(1, name.length() - 1);
            src = new BPSLSource("./baselib/" + parent.getTarget() + "/" + name + ".bpsl", parent.getTarget());
        }
        res.add(src);
        return (src);
    }

    public void importMissing(Scope scope) throws Exception
    {
        for (BPSLSource src : res)
            src.parse(scope);
    }
}