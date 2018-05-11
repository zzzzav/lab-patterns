package ru.zvarko.pattern;

import ru.zvarko.pattern.structural.proxy.ProxySome;
import ru.zvarko.pattern.structural.proxy.SomeInterface;

public class ProxyTest {

    public static void main(String[] args) {
        SomeInterface proxy = new ProxySome();
        proxy.doSome("false", "action name", "param1");
        proxy.doSome("not false", "action name", "param1");
    }
}
