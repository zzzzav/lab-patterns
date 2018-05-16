package ru.zvarko.pattern.structural.decorator;

public class BasicDecor implements BasicInterface {

    protected BasicInterface object;

    public BasicDecor(BasicInterface object) {
        this.object = object;
    }

    public void doSome(String arg) {
        this.object.doSome(arg);
    }
}
