package ru.zvarko.pattern.behavioral.state;

public class StateOn implements State {

    private StateMachine machine;

    public StateOn(StateMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateValue getState() {
        return StateValue.ON;
    }

    @Override
    public void doOn() {
        System.out.println("Machine is already ON");
    }

    @Override
    public void doOff() {
        System.out.println("Machine is going to OFF");
        machine.setState(machine.getOffState());
    }

    @Override
    public void doStandby() {
        System.out.println("Machine is going to STANDBY");
        machine.setState(machine.getStandByState());
    }

    @Override
    public void doAct() {
        System.out.println("Machine is going to ACT");
        machine.setState(machine.getActState());
    }
}
