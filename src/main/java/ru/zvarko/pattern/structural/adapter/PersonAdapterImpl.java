package ru.zvarko.pattern.structural.adapter;

import ru.zvarko.pattern.creational.builder.ThaiGender;
import ru.zvarko.pattern.creational.builder.ThaiPerson;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonAdapterImpl implements PersonAdapter {

    public ThaiPerson getThaiPerson(ClassicPerson classicPerson) {
        String[] names = classicPerson.getFio().split(" +");
        int length = names.length;
        String firstName = null;
        String secondName = null;
        String lastName = null;
        if (length > 3) {
            length = 3;
        }
        switch (length) {
            case 3:
                lastName = names[2];
            case 2:
                secondName = names[1];
            case 1:
                firstName = names[0];
                break;
        }
        ThaiGender gender;
        switch (classicPerson.getGender()) {
            case MALE:
                gender = ThaiGender.MALE;
                break;
            case FEMALE:
                gender = ThaiGender.FEMALE;
                break;
            default:
                gender = ThaiGender.UNKNOWN;
                break;
        }
        Calendar birthDate = GregorianCalendar.getInstance();
        birthDate.setTime(classicPerson.getBirthDate());
        return new ThaiPerson.PersonBuilder()
                .setFirstName(firstName)
                .setSecondName(secondName)
                .setLastName(lastName)
                .setGender(gender)
                .setBirthDate(birthDate)
                .build();
    }

    public ClassicPerson getClassicPerson(ThaiPerson thaiPerson) {
        String fio = thaiPerson.getFirstName().concat(" ").concat(thaiPerson.getSecondName()).concat(" ").concat(thaiPerson.getLastName());
        Date birthDate = thaiPerson.getBirthDate().getTime();
        ClassicGender gender;
        switch (thaiPerson.getGender()) {
            case FEMALE:
                gender = ClassicGender.FEMALE;
                break;
            case MALE:
                gender = ClassicGender.MALE;
                break;
            case FTM:
                gender = ClassicGender.FEMALE;
                break;
            case MTF:
                gender = ClassicGender.MALE;
                break;
            default:
                gender = ClassicGender.UNKNOWN;
                break;
        }
        return new ClassicPerson(fio, birthDate, gender);
    }
}
