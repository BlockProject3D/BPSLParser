package blockproject.bpsl.ast;

import java.util.ArrayList;
import java.util.List;

public class Struct
{
    public enum EQualifier
    {
        CONSTBUF,
        VLAYOUT,
        NONE
    }
    
    public String name;
    public EQualifier qualifier;
    public List<TypeName> attributes = new ArrayList<>();
}