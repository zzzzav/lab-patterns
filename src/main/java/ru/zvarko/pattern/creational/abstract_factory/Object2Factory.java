package ru.zvarko.pattern.creational.abstract_factory;

import ru.zvarko.pattern.creational.factory.MySingletonFactory;
import ru.zvarko.pattern.creational.factory.SomeObj2;
import ru.zvarko.pattern.creational.factory.SomeObject;
import ru.zvarko.pattern.creational.singleton.MySingleton;

public class Object2Factory implements SomeObjAbstractFactory {

    private MySingleton singleton;

    public Object2Factory(MySingletonFactory.SingletonType type) {
        this.singleton = MySingletonFactory.getSingleton(type);
    }

    public SomeObject createObject() {
        return new SomeObj2(singleton);
    }
}
