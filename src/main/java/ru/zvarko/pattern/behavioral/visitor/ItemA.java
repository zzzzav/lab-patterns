package ru.zvarko.pattern.behavioral.visitor;

public class ItemA implements Item {

    private String fieldA;
    private int valueA;

    public ItemA(String fieldA, int valueA) {
        this.fieldA = fieldA;
        this.valueA = valueA;
    }

    public String getFieldA() {
        return fieldA;
    }

    public int getValueA() {
        return valueA;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
