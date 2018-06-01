package ru.zvarko.pattern.behavioral.command;

public class Receiver1 implements Command {

    public Receiver1(Invoker1 r1) {
        this.r1 = r1;
    }

    private Invoker1 r1;

    @Override
    public String doCommand() {
        System.out.println(r1.doSome1());
        return r1.doSome1();
    }
}
