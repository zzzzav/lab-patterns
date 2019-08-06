package ru.zvarko.pattern.creational.factory;

public class SomeObj1 implements SomeObject {

    private String field1;
    private String field2;
    private String field3;

    public SomeObj1(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }
}
