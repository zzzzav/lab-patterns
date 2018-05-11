package ru.zvarko.pattern.structural.proxy;

public class ProxySome implements SomeInterface {

    private SomeInterface original;

    public void doSome(String... params) {
        if ("false".equals(params[0])) {
            System.out.println("nothing was done");
        } else {
            if (original == null) {
                original = new SomeInterface() {
                    public void doSome(String... params) {
                        System.out.println("executing...");
                        for (int i = 1; i < params.length; i++) {
                            System.out.println(params[i]);
                        }
                    }
                };
            }
            original.doSome(params);
        }
    }
}
