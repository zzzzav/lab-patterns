package ru.zvarko.pattern.creational.singleton;

import java.util.UUID;

public class ThreadSafeSingleton implements MySingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null)  {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public String getUUID() {
        return UUID.randomUUID().toString();
    }
}
