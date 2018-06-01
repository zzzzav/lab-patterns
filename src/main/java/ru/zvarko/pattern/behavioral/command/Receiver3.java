package ru.zvarko.pattern.behavioral.command;

public class Receiver3 implements Command {

    public Receiver3(Invoker3 r3) {
        this.r3 = r3;
    }

    private Invoker3 r3;
    @Override
    public String doCommand() {
        System.out.println(r3.doSome3());
        return r3.doSome3();
    }
}
