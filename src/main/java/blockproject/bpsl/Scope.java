package blockproject.bpsl;

import java.util.HashMap;
import java.util.Map;

import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.ConstantExpr;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.statement.Variable;

public class Scope
{
    public Map<String, ConstantExpr> constants = new HashMap<>();
    public Map<String, Struct> structs = new HashMap<>();
    public Map<String, Class> classes = new HashMap<>();
    public Map<String, Function> functions = new HashMap<>();
    public Map<String, Variable> variables = new HashMap<>();
}
