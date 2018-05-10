package ru.zvarko.pattern.structural.adapter;

import java.util.Date;

public class ClassicPerson {
    private String fio;
    private Date birthDate;
    private ClassicGender gender;

    public ClassicPerson(String fio, Date birthDate, ClassicGender gender) {
        this.fio = fio;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ClassicGender getGender() {
        return gender;
    }

    public void setGender(ClassicGender gender) {
        this.gender = gender;
    }
}
