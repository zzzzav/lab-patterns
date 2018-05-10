package ru.zvarko.pattern;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.zvarko.pattern.creational.builder.ThaiGender;
import ru.zvarko.pattern.creational.builder.ThaiPerson;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Test
public class BuilderTest {

    @Test
    public void builderTest() {
        String firstName = "firstName";
        String secondName = "secondName";
        String lastName = "lastName";
        ThaiGender gender = ThaiGender.FEMALE;
        Calendar birthDate = GregorianCalendar.getInstance();
        birthDate.set(1888, 8, 8);

        ThaiPerson person = new ThaiPerson.PersonBuilder()
                .setFirstName(firstName)
                .setSecondName(secondName)
                .setLastName(lastName)
                .setGender(gender)
                .setBirthDate(birthDate)
                .build();

        Assert.assertEquals(person.getBirthDate(), birthDate);
        Assert.assertEquals(person.getFirstName(), firstName);
        Assert.assertEquals(person.getSecondName(), secondName);
        Assert.assertEquals(person.getLastName(), lastName);
        Assert.assertEquals(person.getGender(), gender);

    }
}
