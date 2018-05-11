package ru.zvarko.pattern.structural.composite;

import java.util.Collection;

public interface MyNode {

    String getName();

    void setName(String name);

    MyNode getParent();

    void setParent(MyNode parent);

    Collection<MyNode> getChildren();

    void setChild(MyNode child);

    void printNode(String offset);

}
