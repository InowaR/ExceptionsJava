package org.lessons.lesson2.task3;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 16;
            int b = 0;
            System.out.println(a / b);
            printSum(10, 10);
            int[] abc = new int[]{1, 2};
            abc[3] = 9;
            for (int i : abc)
                System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

