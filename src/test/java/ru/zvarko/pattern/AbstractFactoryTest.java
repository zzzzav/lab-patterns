package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.creational.abstract_factory.Object1Factory;
import ru.zvarko.pattern.creational.abstract_factory.Object2Factory;
import ru.zvarko.pattern.creational.abstract_factory.SomeObjectFactory;
import ru.zvarko.pattern.creational.factory.SomeObj1;
import ru.zvarko.pattern.creational.factory.SomeObj2;
import ru.zvarko.pattern.creational.factory.SomeObject;

import static ru.zvarko.pattern.creational.factory.MySingletonFactory.SingletonType.*;

@Test
public class AbstractFactoryTest {

    @Test
    public void abstractFactory() {
        SomeObject object1 = SomeObjectFactory.getSomeObject(new Object1Factory("a", "b", "c"));
        SomeObject object2 = SomeObjectFactory.getSomeObject(new Object2Factory(THREAD));
        SomeObject object3 = SomeObjectFactory.getSomeObject(new Object2Factory(BLOCK));
        SomeObject object4 = SomeObjectFactory.getSomeObject(new Object2Factory(LAZY));
        SomeObject object5 = SomeObjectFactory.getSomeObject(new Object2Factory(SIMPLE));

        Assert.assertTrue(object1 instanceof SomeObj1);
        Assert.assertTrue(object2 instanceof SomeObj2);
        Assert.assertTrue(object3 instanceof SomeObj2);
        Assert.assertTrue(object4 instanceof SomeObj2);
        Assert.assertTrue(object5 instanceof SomeObj2);
    }
}
