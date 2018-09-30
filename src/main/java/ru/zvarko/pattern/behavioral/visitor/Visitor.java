package ru.zvarko.pattern.behavioral.visitor;

public interface Visitor {

    void visit(ItemA itemA);

    void visit(ItemB itemB);
}
