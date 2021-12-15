/*
 * Java 1. Homework #3
 * @autor Galina Nasonova
 * @version 16.12.2021
 */
public class HomeWorkLesson3 {
    public static void main(String[]args) {
        invertArray();
        System.out.print("\n");
        fillArray();
        System.out.print("\n");
        multiplyAdd();
        System.out.print("\n");
        printArray();
        System.out.print("\n\n");
        fillArrayLen(8,11);
        System.out.print("\n\n");
        findMinMax ();
    }

    static void invertArray() {
        int[]arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? (1) : (0);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    static void fillArray() {
        int[]arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.print(arr[99]+"\n");
    }
    static void multiplyAdd() {
        int[]arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n");
    }
    static void printArray() {
        int[][]arr = {
            {11,0,0,0,55},
            {0,22,33,44,0},
            {0,0,33,0,0},
            {0,22,0,44,0},
            {11,0,0,0,55}
            };
            for (int i = 0; i < arr.length; i++) {
                int j = i;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
            for (int i = 0 ; i < arr.length; i++) {
                int j = arr.length-(i+1);
                System.out.print(arr[i][j] + "  ");
            }
    }
    
    static int [] fillArrayLen (int len, int initialValue) {
        int [] arr=new int [len];
        System.out.println("Length array ="+len+"; Add item ="+ initialValue);
        for (int i=0; i<len; i++) {
            arr[i]=initialValue;
            System.out.print(arr[i]+"  ");
        }
        return (arr);
    }
    static void findMinMax () {
        int[] arr={10,2,5,1,3,8,0,9};
        int max=arr[0], min=arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.print("Min= "+min+"; Max= "+max);
    }
}