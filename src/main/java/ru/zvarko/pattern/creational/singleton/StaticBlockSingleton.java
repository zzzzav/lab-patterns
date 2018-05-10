package ru.zvarko.pattern.creational.singleton;

import java.util.UUID;

public class StaticBlockSingleton implements MySingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {

    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
