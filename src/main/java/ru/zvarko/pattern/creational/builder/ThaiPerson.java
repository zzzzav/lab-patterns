package ru.zvarko.pattern.creational.builder;

import java.util.Calendar;

public class ThaiPerson {
    private String firstName;
    private String secondName;
    private String lastName;

    private ThaiGender gender;
    private Calendar birthDate;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public ThaiGender getGender() {
        return gender;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public ThaiPerson(PersonBuilder builder) {
        this.birthDate = builder.birthDate;
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
    }

    public static class PersonBuilder {
        private String firstName;
        private String secondName;
        private String lastName;
        private ThaiGender gender;
        private Calendar birthDate;

        public PersonBuilder() {
        }

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setGender(ThaiGender gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder setBirthDate(Calendar birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public ThaiPerson build() {
            return new ThaiPerson(this);
        }
    }
}
