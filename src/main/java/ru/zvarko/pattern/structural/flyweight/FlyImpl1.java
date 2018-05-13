package ru.zvarko.pattern.structural.flyweight;

public class FlyImpl1 implements FlyInterface {

    public FlyImpl1() {
        System.out.println("creating " + this.getClass().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSome(String what, String with, int x, int y) {
        System.out.println(this.getClass().getName());
    }
}
