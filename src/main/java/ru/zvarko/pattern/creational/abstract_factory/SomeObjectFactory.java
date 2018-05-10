package ru.zvarko.pattern.creational.abstract_factory;

import ru.zvarko.pattern.creational.factory.SomeObject;

public class SomeObjectFactory {

    public static SomeObject getSomeObject(SomeObjAbstractFactory factory) {
        return factory.createObject();
    }
}
