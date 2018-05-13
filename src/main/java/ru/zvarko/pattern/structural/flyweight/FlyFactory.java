package ru.zvarko.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyFactory {

    private static final Map<FlyType, FlyInterface> flies = new HashMap<FlyType, FlyInterface>();

    public static FlyInterface getShape(FlyType type) {
        FlyInterface impl = flies.get(type);
        if (impl == null) {
            switch (type){
                case TYPE1: impl = new FlyImpl1(); break;
                case TYPE2: impl = new FlyImpl2(); break;
                case TYPE3: impl = new FlyImpl3(); break;
            }
            flies.put(type, impl);
        }
        return impl;
    }
}
