package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.creational.singleton.SimpleSingleton;

@Test
public class SimpleSingletonTest {

    @Test
    public void simpleSingletonTest() {
        SimpleSingleton ss1 = SimpleSingleton.getInstance();
        SimpleSingleton ss2 = SimpleSingleton.getInstance();
        Assert.assertTrue(ss1 == ss2);
    }
}
