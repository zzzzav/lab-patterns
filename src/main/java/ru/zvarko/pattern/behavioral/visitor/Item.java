package ru.zvarko.pattern.behavioral.visitor;

public interface Item {

    void accept(Visitor visitor);
}
