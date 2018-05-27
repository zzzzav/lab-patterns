package ru.zvarko.pattern;

import org.testng.annotations.Test;
import ru.zvarko.pattern.behavioral.observer.Observer;
import ru.zvarko.pattern.behavioral.observer.ObserverImpl;
import ru.zvarko.pattern.behavioral.observer.SubjImpl;
import ru.zvarko.pattern.behavioral.observer.Subject;

@Test
public class ObserverTest {
    @Test
    public void observerTet(){
        Subject subj = new SubjImpl();
        Observer obs1 = new ObserverImpl("obs1");
        Observer obs2 = new ObserverImpl("obs2");
        Observer obs3 = new ObserverImpl("obs3");
        obs1.setSubject(subj);
        obs2.setSubject(subj);
        obs3.setSubject(subj);

        obs1.update();
        subj.postChange("qqq");
    }
}
