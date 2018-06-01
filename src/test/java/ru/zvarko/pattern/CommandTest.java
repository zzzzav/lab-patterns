package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.command.*;

@Test
public class CommandTest {
    @Test
    public void commandTest() {
        Invoker1 in1 = new Invoker1();
        Invoker2 in2 = new Invoker2();
        Invoker3 in3 = new Invoker3();
        Command rec1 = new Receiver1(in1);
        Command rec2 = new Receiver2(in2);
        Command rec3 = new Receiver3(in3);
        Assert.assertEquals(in1.doSome1(), rec1.doCommand());
        Assert.assertEquals(in2.doSome2(), rec2.doCommand());
        Assert.assertEquals(in3.doSome3(), rec3.doCommand());

    }
}
