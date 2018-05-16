package ru.zvarko.pattern;

import org.testng.annotations.Test;
import ru.zvarko.pattern.structural.decorator.*;

@Test
public class DecorTest {
    @Test
    public void decorTest() {
        BasicInterface o1 = new FirstDecorator(new SecondDecorator(new BasicImpl()));
        o1.doSome("what?");
    }
}
