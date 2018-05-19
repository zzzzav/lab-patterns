package ru.zvarko.pattern;

import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.mediator.ChatMediator;
import ru.zvarko.pattern.behavioral.mediator.ChatUser;
import ru.zvarko.pattern.behavioral.mediator.Mediator;
import ru.zvarko.pattern.behavioral.mediator.User;

@Test
public class MediatorTest {
    @Test
    public void mediatorTest() {
        Mediator mediator = new ChatMediator();
        User user1 = new ChatUser(mediator, "user1");
        User user2 = new ChatUser(mediator, "user2");
        User user3 = new ChatUser(mediator, "user3");
        User user4 = new ChatUser(mediator, "user4");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.send("hi all");
        user1.send("hi, user2", user2);
        user1.send("hi, user2", user4);
    }
}
