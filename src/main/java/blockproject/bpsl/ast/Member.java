package blockproject.bpsl.ast;

import java.util.ArrayList;
import java.util.List;

public class Member
{
    public TypeName typeName = new TypeName();
    public List<TypeName> parameters = new ArrayList<>();
}