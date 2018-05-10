package ru.zvarko.pattern.creational.singleton;

import java.util.UUID;

public class SimpleSingleton {

    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {

    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
