package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.strategy.DeepCopyStrategy;
import ru.zvarko.pattern.behavioral.strategy.Dto;
import ru.zvarko.pattern.behavioral.strategy.DtoCopier;
import ru.zvarko.pattern.behavioral.strategy.FlywayCopyStrategy;

import java.util.ArrayList;
import java.util.Arrays;

@Test
public class StrategyTest {
    @Test
    public void strategyTest(){
        Dto dto1 = new Dto("dto1", Arrays.asList(new String[]{"one", "two", "three"}));
        DtoCopier copier = new DtoCopier();
        Dto dto2 = copier.copyDto(dto1, new FlywayCopyStrategy());
        Assert.assertTrue(dto2.getName() == dto1.getName());
        Assert.assertTrue(dto2.getItems() == dto1.getItems());

        Dto dto3 = copier.copyDto(dto1, new DeepCopyStrategy());
        Assert.assertFalse(dto3.getName() == dto1.getName());
        Assert.assertFalse(dto3.getItems() == dto1.getItems());
        Assert.assertEquals(dto3.getItems(), dto1.getItems());
    }
}
