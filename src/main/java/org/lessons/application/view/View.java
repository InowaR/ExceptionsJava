package org.lessons.application.view;

import org.lessons.application.presenter.Presenter;
import java.util.Scanner;

public class View {
    private final Scanner scanner;
    private final Presenter presenter;
    private boolean work;

    public View() {
        scanner = new Scanner(System.in);
        presenter = new Presenter();
        work = true;
    }

    private void start(){
        System.out.println("Программа для сохранения данных о человеке в файл");
    }
    private void finish() {
        System.out.println("Выход");
        work = false;
    }

    public void printMenu() {
        System.out.println("Главное меню:");
        System.out.println("1. Создать нового человека");
        System.out.println("2. Сохранить нового человека");
        System.out.println("3. Выйти из приложения");
    }

    public void execute() {
        System.out.println("Введите номер команды:");
        int number = scanner.nextInt();
        if (number == 1) {
            presenter.createPerson();
        } else if (number == 2) {
            presenter.savePerson();
        } else if (number == 3) {
            finish();
        } else {
            System.out.println("Такой команды нет");
        }
    }

    public void startApp() {
        start();
        while (work) {
            printMenu();
            execute();
        }
    }
}
