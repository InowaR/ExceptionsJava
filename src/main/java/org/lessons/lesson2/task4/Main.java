package org.lessons.lesson2.task4;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();
            if (Objects.equals(input, "")) {
                System.out.println("Нельзя вводить пустые строки. Попробуйте снова.");
            } else {
                System.out.println("Прочитано");
                work = false;
            }
        }
    }
}
