package blockproject.bpsl.ast.statement;

import java.util.ArrayList;
import java.util.List;

public class Compound extends Statement
{
    public List<Statement> statements = new ArrayList<>();

    public Compound()
    {
        super(EType.COMPOUND);
    }
}