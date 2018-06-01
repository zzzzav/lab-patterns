package ru.zvarko.pattern.behavioral.state;

public class StateStandBy implements State {

    private StateMachine machine;

    public StateStandBy(StateMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateValue getState() {
        return StateValue.STANDBY;
    }

    @Override
    public void doOn() {
        System.out.println("Machine is in STANDBY it is almost ON");
    }

    @Override
    public void doOff() {
        System.out.println("Machine is going to OFF");
        machine.setState(machine.getOffState());
    }

    @Override
    public void doStandby() {
        System.out.println("Machine is already in STANDBY");
    }

    @Override
    public void doAct() {
        System.out.println("Machine is going to ACT");
        machine.setState(machine.getActState());
    }
}
