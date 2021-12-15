/*
 * Java 1. Homework #2
 * @autor Galina Nasonova
 * @version 12.12.2021
 */
public class HomeWorkLesson2 {
    public static void main(String[]args) {

        System.out.println(checkValue(5, 4));
        System.out.println(checkValue(5, 10));
        System.out.println(checkValue(10, 10));
        checkSign(-8);
        checkSign(20);
        System.out.println(checkSignReturn(5));
        System.out.println(checkSignReturn(-10));
        printStrRoud("Hello!", 3);
        System.out.println(leapYear(1600));
        System.out.println(leapYear(1900));
        System.out.println(leapYear(1236));
    }

    static boolean checkValue(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    static void checkSign(int a) {
        System.out.println(a >= 0 ? "Number is positiv" : "Number is negativ");
    }
    static boolean checkSignReturn(int a) {
        return a < 0;
    }
    static void printStrRoud(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("String: " + str);
        }
    }
    static String leapYear(int a) {
        if ((a % 4)== 0 && (a % 100) !=0 || (a % 400) == 0) {
                return ("Year leap");
            }
        return ("Year not leap ");
    }
}
