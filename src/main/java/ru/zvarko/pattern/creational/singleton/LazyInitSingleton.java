package ru.zvarko.pattern.creational.singleton;

import java.util.UUID;

public class LazyInitSingleton implements MySingleton{
    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
    }

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
