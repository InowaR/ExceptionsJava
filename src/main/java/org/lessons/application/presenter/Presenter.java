package org.lessons.application.presenter;

import org.lessons.application.model.Service;
import org.lessons.application.model.exceptions.InvalidDataLengthException;
import org.lessons.application.model.exceptions.NotEnoughDataException;
import org.lessons.application.view.View;

import java.util.Scanner;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
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
