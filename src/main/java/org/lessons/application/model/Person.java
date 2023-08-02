package org.lessons.application.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final LocalDate birthDate;
    private final long phone;
    private final Gender gender;

    public Person(String lastName, String firstName, String middleName, LocalDate birthDate, long phone, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "<" + lastName + "><" + firstName + "><" + middleName + "><" + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + "><" + phone + "><" + gender + ">";
    }
}
