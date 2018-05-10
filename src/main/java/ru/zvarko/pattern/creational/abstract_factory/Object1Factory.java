package ru.zvarko.pattern.creational.abstract_factory;

import ru.zvarko.pattern.creational.factory.SomeObj1;
import ru.zvarko.pattern.creational.factory.SomeObject;

public class Object1Factory implements SomeObjAbstractFactory{

    private String a, b, c;

    public Object1Factory(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public SomeObject createObject() {
        return new SomeObj1(a, b, c);
    }
}
