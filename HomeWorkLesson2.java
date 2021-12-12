/*
 * Java 1. Homework #1
 * @autor Galina Nasonova
 * @version 12.12.2021
 */
public class HomeWorkLesson2 {
    public static void main(String[]args) {

        checkValue(10, 30);
        //checkSign(-8);
        //checkSignReturn(5);
        //printStrRoud("Hello!", 3);
        System.out.println (leapYear(1600));

    }

    static boolean checkValue(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20 ? true : false;
    }

    static void checkSign(int a) {
        System.out.println(a >= 0 ? "Number is positiv" : "Number is negativ");
    }
    static boolean checkSignReturn(int a) {
        return a < 0 ? true : false;
    }
    static void printStrRoud(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("String: " + str);
        }
    }
    static String leapYear(int a) {
        if ((a % 4) == 0) {
            if ((a % 100) == 0) {
                if ((a % 400) == 0) {
                    return ("Year leap");
                } else {
                    return ("Year not leap ");
                }
            } else {
                return ("Year leap ");
            }
        } else {
            return ("Year not leap");
        }
    }
}
