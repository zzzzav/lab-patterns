package ru.zvarko.pattern.behavioral.observer;

public class ObserverImpl implements Observer {

    private String name;
    private Subject topic;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (topic == null) {
            System.out.println(String.format("%s::topic is null", name));
            return;
        }
        String message = (String) topic.getUpdate(this);
        if (message != null) {
            System.out.println(String.format("%s::consuming::%s", name, message));
        } else {
            System.out.println(String.format("%s::no new message", name));
        }
    }

    @Override
    public void setSubject(Subject subj) {
        this.topic = subj;
        subj.register(this);
    }
}
