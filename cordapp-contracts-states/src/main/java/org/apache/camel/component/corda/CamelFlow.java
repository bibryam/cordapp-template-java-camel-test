package org.apache.camel.component.corda;

import co.paralleluniverse.fibers.Suspendable;
import net.corda.core.flows.FlowLogic;
import net.corda.core.flows.StartableByRPC;

@StartableByRPC
public class CamelFlow extends FlowLogic<String> {
    private String in;

    public CamelFlow(String in) {
        this.in = in;
    }

    @Suspendable
    @Override
    public String call() {
        return in + " world!";
    }
}
