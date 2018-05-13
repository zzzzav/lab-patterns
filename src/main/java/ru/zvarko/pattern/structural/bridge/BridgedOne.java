package ru.zvarko.pattern.structural.bridge;

public class BridgedOne implements BridgedInterface {
    private String message;

    public BridgedOne(String message) {
        this.message = message;
    }

    public void doBridge() {
        System.out.println(this.getClass().getName() + " " + message);
    }
}
