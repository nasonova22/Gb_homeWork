/*
 * Java 1. Homework #1
 * @autor Galina Nasonova
 * @version 10.12.2021
 */

public class HomeWorkLesson1 {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = -40;
        int b = -20;
        System.out.println(a + b >= 0 ? "Sum positive" : "Sum negative");
    }
    static void printColor() {
        int a = 110;
        if (a <= 0) {
            System.out.println("Red");
        }
        if ((a > 0) & (a <= 100)) {
            System.out.println("Yellow");
        }
        if (a > 100) {
            System.out.println("Green");
        }
    }
    static void compareNumbers() {
        int a,
        b;
        a = 80;
        b = 50;
        System.out.println(a >= b ? "a >= b" : "a<b");
    }
}
