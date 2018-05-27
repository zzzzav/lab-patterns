package ru.zvarko.pattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyStrategy implements CopyStrategy {
    @Override
    public Dto copy(Dto source) {
        List<String > target = new ArrayList<>(source.getItems());
        String name = new String(source.getName());
        return new Dto(name, target);
    }
}
