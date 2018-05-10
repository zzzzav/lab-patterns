package ru.zvarko.pattern.creational.factory;

import ru.zvarko.pattern.creational.singleton.*;

public class MySingletonFactory {
    public static MySingleton getSingleton(SingletonType type){
        switch (type){
            case LAZY: return LazyInitSingleton.getInstance();
            case BLOCK: return StaticBlockSingleton.getInstance();
            case SIMPLE: return SimpleSingleton.getInstance();
            case THREAD: return ThreadSafeSingleton.getInstance();
            default: return ThreadSafeSingleton.getInstance();
        }
    }

    public enum SingletonType {
        LAZY, SIMPLE, BLOCK, THREAD
    }
}
