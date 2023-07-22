package org.lessons.lesson1.task1;

public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[]{1,2};
        System.out.println(arr[2]);
    }

    public static void divisionByZero() {
        int a = 3;
        int b = 0;
        System.out.println(a/b);
    }

    public static void numberFormatException() {
        Integer num = Integer.valueOf("12.3");
        String str = num.toString();
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}
