package org.lessons.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[] {0,1,2,3,4,5,6,7,8};
        int d = 0;
        double catchedRes1 = (double) intArray[8] / d;
        if (!Double.isFinite(catchedRes1)) {
            System.out.println("Error");
        } else {
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
