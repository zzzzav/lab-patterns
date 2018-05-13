package ru.zvarko.pattern;

import org.testng.annotations.Test;
import ru.zvarko.pattern.structural.flyweight.FlyImpl1;
import ru.zvarko.pattern.structural.flyweight.FlyImpl2;
import ru.zvarko.pattern.structural.flyweight.FlyInterface;

@Test
public class FlyWeightTest {

    @Test
    public void someTest() {
        FlyInterface o1 =new FlyImpl1();
        FlyInterface o2 =new FlyImpl2();
        o1.doSome(null, null, 0,0);
        o2.doSome(null, null, 0,0);
    }
}
