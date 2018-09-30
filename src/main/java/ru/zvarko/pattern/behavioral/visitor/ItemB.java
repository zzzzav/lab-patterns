package ru.zvarko.pattern.behavioral.visitor;

public class ItemB implements Item {
    private String fieldB;
    private int valueB;

    public ItemB(String fieldB, int valueB) {
        this.fieldB = fieldB;
        this.valueB = valueB;
    }

    public String getFieldB() {
        return fieldB;
    }

    public int getValueB() {
        return valueB;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
