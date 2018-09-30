package ru.zvarko.pattern;

import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.visitor.*;

@Test
public class VisitorTest {

    @Test
    public void visitorTest() {
        Item item1 = new ItemA("one", 1);
        Item item2 = new ItemB("two", 2);
        Visitor visitor = new VisitorImpl();
        item1.accept(visitor);
        item2.accept(visitor);
    }
}
