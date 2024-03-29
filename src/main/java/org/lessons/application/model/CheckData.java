package org.lessons.application.model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class CheckData {
    private final Map<String, String> dataMap;
    private Person person;

    public CheckData() {
        dataMap = new HashMap<>();
    }

    public void printPerson() {
        System.out.println(person);
    }

    public void setDataMap(String[] dataInput){
        for (String item : dataInput) {
            String[] itemData = item.split(":");
            try {
                dataMap.put(itemData[0], itemData[1]);
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Ошибка: неверный формат данных");
            }
        }

        String lastName = dataMap.get("Фамилия");
        String firstName = dataMap.get("Имя");
        String middleName = dataMap.get("Отчество");
        String birthDateStr = dataMap.get("ДатаРождения");
        String phoneStr = dataMap.get("НомерТелефона");
        String genderStr = dataMap.get("Пол");

        LocalDate birthDate = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(birthDateStr, formatter);
        } catch (DateTimeParseException | InputMismatchException e) {
            System.out.println("Ошибка: неверный формат даты рождения");
        }

        long phone = 0;
        try {
            phone = Long.parseLong(phoneStr);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
        }

        Gender gender = null;
        try {
            gender = Gender.valueOf(genderStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: неверный формат пола");
        }

        if (lastName == null || firstName == null || middleName == null || birthDate == null || phone == 0 || gender == null) {
            System.out.println("Ошибка: не все данные были введены");
        } else {
            person = new Person(lastName, firstName, middleName, birthDate, phone, gender);
        }
    }

    public void savePerson() {
        try {
            FileWriter writer = new FileWriter(person.getLastName() + ".txt", true);
            writer.write(person + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка: не удалось записать данные в файл");
        }
    }
}
