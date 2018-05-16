package ru.zvarko.pattern.structural.decorator;

public class FirstDecorator extends BasicDecor {
    public FirstDecorator(BasicInterface object) {
        super(object);
    }

    @Override
    public void doSome(String arg) {
        object.doSome(arg);
        System.out.println(this.getClass().getName() + " " + arg);
    }
}
