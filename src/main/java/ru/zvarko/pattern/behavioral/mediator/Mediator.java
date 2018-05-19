package ru.zvarko.pattern.behavioral.mediator;

public interface Mediator {
    void sendMessageTo(String message, User user);
    void sendMessageToAll(String message, User user);
    void addUser(User user);
}
