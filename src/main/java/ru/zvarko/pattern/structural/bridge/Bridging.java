package ru.zvarko.pattern.structural.bridge;

public abstract class Bridging {
    protected BridgedInterface inner;

    public Bridging(BridgedInterface inner) {
        this.inner = inner;
    }

    abstract public void doBridge();
}
