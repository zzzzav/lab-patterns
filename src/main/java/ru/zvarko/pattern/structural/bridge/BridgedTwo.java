package ru.zvarko.pattern.structural.bridge;

public class BridgedTwo implements BridgedInterface {
    private String message;

    public BridgedTwo(String message) {
        this.message = message;
    }

    public void doBridge() {
        System.out.println(this.getClass().getName() + " " + message);
    }
}
