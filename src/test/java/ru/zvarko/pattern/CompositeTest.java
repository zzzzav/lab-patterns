package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.structural.composite.MyNode;
import ru.zvarko.pattern.structural.composite.RootNode;
import ru.zvarko.pattern.structural.composite.SimpleNode;

@Test
public class CompositeTest {

    @Test
    public void testComposite() {
        MyNode root = new RootNode("root node");
        MyNode root1 = new RootNode("new root node");

        MyNode node1 = new SimpleNode("node1");
        MyNode node2 = new SimpleNode("node2");
        MyNode node3 = new SimpleNode("node3");
        MyNode node4 = new SimpleNode("node4");
        MyNode node5 = new SimpleNode("node5");

        root.setChild(node1);
        root.setChild(root1);
        root.setChild(node2);
        root1.setChild(node3);
        root1.setChild(node4);
        root1.setChild(node5);

        Assert.assertTrue(root1.getParent() == root);
        Assert.assertTrue(node1.getParent() == root);
        Assert.assertTrue(node4.getParent() == root1);

        root.printNode("|");
        root.setChild(node5);
        Assert.assertFalse(root1.getChildren().contains(node5));
        Assert.assertTrue(root.getChildren().contains(node5));
        Assert.assertTrue(node5.getParent() == root);
        root.printNode("|");
    }
}
