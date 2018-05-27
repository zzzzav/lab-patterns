package ru.zvarko.pattern.behavioral.observer;

public interface Observer {
    void update();

    void setSubject(Subject subj);
}
