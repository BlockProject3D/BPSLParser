package blockproject.bpsl.ast;

import java.util.ArrayList;
import java.util.List;

public class Class
{
    public String name;
    public List<Function> members = new ArrayList<>();
    public List<TypeName> attributes = new ArrayList<>();
}