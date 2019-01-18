package blockproject.bpsl.ast;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.ast.statement.Statement;

public class Constructor
{
    public List<TypeName> parameters = new ArrayList<>();
    public List<Statement> statements = new ArrayList<>();
    public String internalName;
}