package ru.zvarko.pattern.behavioral.state;

public class StateAct implements State {

    private StateMachine machine;

    public StateAct(StateMachine machine) {
        this.machine = machine;
    }

    @Override
    public StateValue getState() {
        return StateValue.ACT;
    }

    @Override
    public void doOn() {
        System.out.println("Machine is in ACT mode that means ON mode");
    }

    @Override
    public void doOff() {
        System.out.println("First put machine to the STANDBY mode");
    }

    @Override
    public void doStandby() {
        System.out.println("Machine is going to STANDBY");
        machine.setState(machine.getStandByState());
    }

    @Override
    public void doAct() {
        System.out.println("Machine is already in ACT mode");
    }
}
