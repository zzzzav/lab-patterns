package ru.zvarko.pattern.behavioral.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(ItemA itemA) {
        System.out.println(this.getClass().getName() + "::" + itemA.getFieldA() + itemA.getValueA());
    }

    @Override
    public void visit(ItemB itemB) {
        System.out.println(this.getClass().getName() + "::" + itemB.getFieldB() + itemB.getValueB());
    }
}
