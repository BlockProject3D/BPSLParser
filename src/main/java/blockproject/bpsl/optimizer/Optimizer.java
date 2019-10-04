package blockproject.bpsl.optimizer;

import java.util.ArrayList;
import java.util.List;

import blockproject.bpsl.Scope;

public class Optimizer
{
    private Scope _scope;

    public Optimizer(Scope sc)
    {
        _scope = sc;
    }

    public void run()
    {
        List<IOptimizerPass> passes = new ArrayList<>();

        for (IOptimizerPass pass : passes)
            _scope = pass.run(_scope);
    }
}