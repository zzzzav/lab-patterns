package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.creational.builder.ThaiPerson;
import ru.zvarko.pattern.structural.adapter.ClassicGender;
import ru.zvarko.pattern.structural.adapter.ClassicPerson;
import ru.zvarko.pattern.structural.adapter.PersonAdapter;
import ru.zvarko.pattern.structural.adapter.PersonAdapterImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Test
public class AdapterTest {

    @Test
    public void personToPersonTest() {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1888, 8, 8);
        Date date = calendar.getTime();
        ClassicPerson classicPerson = new ClassicPerson("ffff iii ooo", date, ClassicGender.MALE);
        PersonAdapter adapter = new PersonAdapterImpl();
        ThaiPerson thaiPerson = adapter.getThaiPerson(classicPerson);
        ClassicPerson reveredPerson = adapter.getClassicPerson(thaiPerson);

        Assert.assertEquals(reveredPerson.getFio(), classicPerson.getFio());
        Assert.assertEquals(reveredPerson.getGender(), classicPerson.getGender());
        Assert.assertEquals(reveredPerson.getBirthDate(), classicPerson.getBirthDate());
    }
}
