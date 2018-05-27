package ru.zvarko.pattern.behavioral.strategy;

public class FlywayCopyStrategy implements CopyStrategy {
    @Override
    public Dto copy(Dto source) {
        return new Dto(source.getName(), source.getItems());
    }
}
