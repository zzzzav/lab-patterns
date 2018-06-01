package ru.zvarko.pattern.behavioral.state;

public class StateMachine implements State {

    private final State onState;
    private final State offState;
    private final State standByState;
    private final State actState;

    private State state;

    public StateMachine() {
        onState = new StateOn(this);
        offState = new StateOff(this);
        standByState = new StateStandBy(this);
        actState = new StateAct(this);
        state = onState;
    }

    @Override
    public StateValue getState() {
        return state.getState();
    }

    @Override
    public void doOn() {
        state.doOn();
    }

    @Override
    public void doOff() {
        state.doOff();
    }

    @Override
    public void doStandby() {
        state.doStandby();
    }

    @Override
    public void doAct() {
        state.doAct();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }

    public State getStandByState() {
        return standByState;
    }

    public State getActState() {
        return actState;
    }
}
