package ru.zvarko.pattern.creational.factory;

import static ru.zvarko.pattern.creational.factory.MySingletonFactory.SingletonType.SIMPLE;

public class MySomeObjFactory {

    public static SomeObject getObject(String field1, String field2, String field3) {
        return new SomeObj1(field1, field2, field3);
    }

    public static SomeObject getObject() {
        return new SomeObj2(MySingletonFactory.getSingleton(SIMPLE));
    }
}
