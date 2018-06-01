package ru.zvarko.pattern.behavioral.state;

public class StateOff implements State {

    private StateMachine machine;

    public StateOff(StateMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateValue getState() {
        return StateValue.OFF;
    }

    @Override
    public void doOn() {
        System.out.println("Machine is going to ON");
        machine.setState(machine.getOnState());
    }

    @Override
    public void doOff() {
        System.out.println("Machine is already OFF");
    }

    @Override
    public void doStandby() {
        System.out.println("Machine cannot standby in OFF state");
    }

    @Override
    public void doAct() {
        System.out.println("Machine cannot act in OFF state");
    }
}
