package ru.zvarko.pattern.structural.bridge;

public class BridgingOne extends Bridging {

    public BridgingOne(BridgedInterface inner) {
        super(inner);
    }

    public void doBridge() {
        System.out.print(this.getClass().getName() + " ");
        inner.doBridge();
    }
}
