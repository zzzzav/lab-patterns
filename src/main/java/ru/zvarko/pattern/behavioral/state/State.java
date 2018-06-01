package ru.zvarko.pattern.behavioral.state;

public interface State {
    StateValue getState();
    void doOn();
    void doOff();
    void doStandby();
    void doAct();
}
