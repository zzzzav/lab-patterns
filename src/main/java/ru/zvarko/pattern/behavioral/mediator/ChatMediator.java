package ru.zvarko.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    public void sendMessageTo(String message, User user) {
        if (users.contains(user)) {
            user.receive(message);
        } else {
            System.out.println(String.format("user %s cannot receive message %s", user.name, message));
        }
    }

    public void sendMessageToAll(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }

    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }
}
