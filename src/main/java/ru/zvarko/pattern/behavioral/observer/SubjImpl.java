package ru.zvarko.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjImpl implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String object;
    private boolean changed;
    private final Object LOCK = new Object();

    @Override
    public void register(Observer observer) {
        if (observer != null) {
            synchronized (LOCK) {
                if (!observers.contains(observer)) {observers.add(observer);}
            }
        }
    }

    @Override
    public void unRegister(Observer observer) {
        synchronized (LOCK) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> local = null;
        synchronized (LOCK){
            if (!changed) {return;}
            local = new ArrayList<>(observers);
            changed = false;
        }
        local.forEach(observer -> observer.update());
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.object;
    }

    @Override
    public void postChange(Object o) {
        this.object = o.toString();
        System.out.println(String.format("subj::setting param::%s", object));
        this.changed = true;
        notifyObservers();
    }
}
