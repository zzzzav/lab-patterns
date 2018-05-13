package ru.zvarko.pattern.structural.bridge;

public class BridgingTwo extends Bridging {

    public BridgingTwo(BridgedInterface inner) {
        super(inner);
    }

    public void doBridge() {
        System.out.print(this.getClass().getName() + " ");
        inner.doBridge();
    }
}
