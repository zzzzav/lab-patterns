package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.creational.factory.*;
import ru.zvarko.pattern.creational.singleton.*;

import static ru.zvarko.pattern.creational.factory.MySingletonFactory.SingletonType.*;


@Test
public class FactoryTest {

    @Test
    public void testFactory() {
        MySingleton singleton = MySingletonFactory.getSingleton(LAZY);
        Assert.assertTrue(singleton instanceof LazyInitSingleton);

        singleton = MySingletonFactory.getSingleton(SIMPLE);
        Assert.assertTrue(singleton instanceof SimpleSingleton);

        singleton = MySingletonFactory.getSingleton(BLOCK);
        Assert.assertTrue(singleton instanceof StaticBlockSingleton);

        singleton = MySingletonFactory.getSingleton(THREAD);
        Assert.assertTrue(singleton instanceof ThreadSafeSingleton);
    }

    @Test
    public void someObjFactory() {
        SomeObject o1 = MySomeObjFactory.getObject();
        Assert.assertTrue(o1 instanceof SomeObj2);

        SomeObject o2 = MySomeObjFactory.getObject(o1.getField1(), o1.getField2(), o1.getField3());
        Assert.assertTrue(o2 instanceof SomeObj1);
    }
}
