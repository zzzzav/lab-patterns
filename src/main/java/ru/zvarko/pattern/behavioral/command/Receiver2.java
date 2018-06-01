package ru.zvarko.pattern.behavioral.command;

public class Receiver2 implements Command {

    public Receiver2(Invoker2 r2) {
        this.r2 = r2;
    }

    private Invoker2 r2;
    @Override
    public String doCommand() {
        System.out.println(r2.doSome2());
        return r2.doSome2();
    }
}
