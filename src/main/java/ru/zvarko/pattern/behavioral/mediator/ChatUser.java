package ru.zvarko.pattern.behavioral.mediator;

public class ChatUser extends User {

    public ChatUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void send(String message) {
        System.out.println(String.format("sending %s from %s", message, this.name));
        this.mediator.sendMessageToAll(message, this);
    }

    public void send(String message, User user) {
        System.out.println(String.format("sending %s from %s to %s", message, this.name, user.name));
        this.mediator.sendMessageTo(message, user);
    }

    public void receive(String message) {
        System.out.println(String.format("user %s receive %s", this.name, message));
    }
}
