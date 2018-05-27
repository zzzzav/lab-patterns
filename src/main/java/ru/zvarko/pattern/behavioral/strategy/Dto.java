package ru.zvarko.pattern.behavioral.strategy;

import lombok.Getter;

import java.util.Collection;

@Getter
public class Dto {
    private final String name;
    private final Collection<String> items;

    public Dto(String name, Collection<String> items) {
        this.name = name;
        this.items = items;
    }
}
