package ru.zvarko.pattern.creational.factory;

import ru.zvarko.pattern.creational.singleton.MySingleton;

import java.util.UUID;

public class SomeObj2 implements SomeObject {

    MySingleton singleton;

    public SomeObj2(MySingleton singleton) {
        this.singleton = singleton;
    }

    public String getField1() {
        return singleton.getUUID();
    }

    public String getField2() {
        return singleton.getUUID();
    }

    public String getField3() {
        return singleton.getUUID();
    }
}
