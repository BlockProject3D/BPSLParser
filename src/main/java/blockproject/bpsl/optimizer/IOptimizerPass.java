package blockproject.bpsl.optimizer;

import blockproject.bpsl.Scope;

public interface IOptimizerPass
{
    public Scope run(Scope scope);
}