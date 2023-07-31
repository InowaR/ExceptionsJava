package org.lessons.application;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в любом порядке, разделяя их пробелом:");
        System.out.println("Фамилия:Иванов Имя:Иван Отчество:Иванович Пол:m ДатаРождения:01.01.2000 НомерТелефона:79012345678");

        Map<String, String> dataMap = new HashMap<>();
        String[] data = scanner.nextLine().split(" ");

        for (String item : data) {
            String[] itemData = item.split(":");
            if (itemData.length != 2) {
                System.out.println("Ошибка: неверный формат данных");
                return;
            }
            dataMap.put(itemData[0], itemData[1]);
        }

        String lastName = dataMap.get("Фамилия");
        String firstName = dataMap.get("Имя");
        String middleName = dataMap.get("Отчество");
        String birthDateStr = dataMap.get("ДатаРождения");
        String phoneStr = dataMap.get("НомерТелефона");
        String genderStr = dataMap.get("Пол");

        if (lastName == null || firstName == null || middleName == null || birthDateStr == null || phoneStr == null || genderStr == null) {
            System.out.println("Ошибка: не все данные были введены");
            return;
        }

        LocalDate birthDate;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(birthDateStr, formatter);
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат даты рождения");
            return;
        }

        long phone;
        try {
            phone = Long.parseLong(phoneStr);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона");
            return;
        }

        Gender gender;
        try {
            gender = Gender.valueOf(genderStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: неверный формат пола");
            return;
        }

        Person person = new Person(lastName, firstName, middleName, birthDate, phone, gender);
        try {
            FileWriter writer = new FileWriter(lastName + ".txt", true);
            writer.write(person + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка: не удалось записать данные в файл");
        }
    }
}
