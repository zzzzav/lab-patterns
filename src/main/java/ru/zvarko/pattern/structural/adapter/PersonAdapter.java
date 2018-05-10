package ru.zvarko.pattern.structural.adapter;

import ru.zvarko.pattern.creational.builder.ThaiPerson;

public interface PersonAdapter {

    ThaiPerson getThaiPerson(ClassicPerson classicPerson);

    ClassicPerson getClassicPerson(ThaiPerson thaiPerson);

}
