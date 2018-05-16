package ru.zvarko.pattern.structural.decorator;

public class BasicImpl implements BasicInterface {
    public void doSome(String arg) {
        System.out.println(this.getClass().getName() + " " + arg);
    }
}
