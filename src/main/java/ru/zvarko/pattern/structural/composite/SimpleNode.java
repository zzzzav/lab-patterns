package ru.zvarko.pattern.structural.composite;

import java.util.List;

public class SimpleNode implements MyNode {

    private String name;
    private MyNode parent;

    public SimpleNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyNode getParent() {
        return parent;
    }

    public void setParent(MyNode parent) {
        this.parent = parent;
    }

    public List<MyNode> getChildren() {
        return null;
    }

    public void setChild(MyNode child) {

    }

    public void printNode(String offset) {
        System.out.println(offset + getName());
    }
}
