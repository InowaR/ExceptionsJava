package org.lessons.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private long phone;
    private Gender gender;

    public Person(String lastName, String firstName, String middleName, LocalDate birthDate, long phone, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + " " + birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                " " + phone + " " + gender;
    }
}
