package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.template.*;

@Test
public class TemplateMethodTest {

    @Test
    public void doDailyRoutine() {
        Routine routine = new Routine();
        BasicDailyRoutine doRoutine = new SvetaDailyRoutine();
        doRoutine.doAllSteps(routine);
        Assert.assertEquals(routine.getStepOne(), Step.WAKEUP);
        Assert.assertEquals(routine.getStepTwo(), Step.GOING_SHOWER);
        Assert.assertEquals(routine.getStepThree(), Step.CLEAN_TEETH);
        Assert.assertEquals(routine.getStepFour(), Step.DRESSING);

        doRoutine = new SashaDailyRoutine();
        doRoutine.doAllSteps(routine);
        Assert.assertEquals(routine.getStepThree(), Step.GOING_BREAKFAST);
    }
}
