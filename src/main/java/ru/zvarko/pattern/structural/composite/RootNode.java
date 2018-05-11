package ru.zvarko.pattern.structural.composite;

import java.util.Collection;
import java.util.HashSet;

public class RootNode implements MyNode {

    private String name;
    private MyNode parent;
    private Collection<MyNode> children;

    public RootNode(String name) {
        this.name = name;
        children = new HashSet<MyNode>();
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

    public Collection<MyNode> getChildren() {
        return children;
    }

    public void setChild(MyNode child) {
        this.children.add(child);
        if (child.getParent() != null) {child.getParent().getChildren().remove(child);}
        child.setParent(this);
    }

    public void printNode(String offset) {
        if (offset == null) {offset = "";}
        System.out.println(offset + getName());
        for (MyNode child : children) {
            child.printNode(offset.concat(offset.length() == 0 ? " " : offset.substring(0, 1)));
        }
    }
}
