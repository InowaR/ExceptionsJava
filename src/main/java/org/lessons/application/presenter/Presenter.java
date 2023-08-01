package org.lessons.application.presenter;

import org.lessons.application.model.Service;
import java.util.Scanner;

public class Presenter {
    private final Service service;

    public Presenter() {
        service = new Service();
    }

    public void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в любом порядке, разделяя их пробелом:");
        System.out.println("Фамилия:Иванов Имя:Иван Отчество:Иванович Пол:m ДатаРождения:01.01.2000 НомерТелефона:79012345678");
        String[] dataInput = scanner.nextLine().split(" ");
        service.createPerson(dataInput);
    }

    public void savePerson() {
        service.savePerson();
        System.out.println("Сохранено");
    }
}
