package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.state.StateMachine;
import ru.zvarko.pattern.behavioral.state.StateValue;

@Test
public class StateTest {

    @Test
    public void stateTest() {
        StateMachine machine = new StateMachine();
        Assert.assertEquals(machine.getState(), StateValue.ON);
        machine.doAct();
        Assert.assertEquals(machine.getState(), StateValue.ACT);
        machine.doOff();
        Assert.assertEquals(machine.getState(), StateValue.ACT);
        machine.doStandby();
        Assert.assertEquals(machine.getState(), StateValue.STANDBY);
        machine.doOn();
        Assert.assertEquals(machine.getState(), StateValue.STANDBY);
        machine.doOff();
        Assert.assertEquals(machine.getState(), StateValue.OFF);
        machine.doAct();
        Assert.assertEquals(machine.getState(), StateValue.OFF);
        machine.doOn();
        Assert.assertEquals(machine.getState(), StateValue.ON);
    }
}
