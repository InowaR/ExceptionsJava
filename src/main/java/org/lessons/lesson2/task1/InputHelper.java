package org.lessons.lesson2.task1;
import java.util.Scanner;

public class InputHelper {
    public static double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.contains(".")) {
                try {
                    return Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка. Попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка. Попробуйте снова.");
            }
        }
    }
}