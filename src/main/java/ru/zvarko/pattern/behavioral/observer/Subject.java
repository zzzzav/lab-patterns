package ru.zvarko.pattern.behavioral.observer;

public interface Subject {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObservers();

    Object getUpdate(Observer observer);

    void postChange(Object o);
}
