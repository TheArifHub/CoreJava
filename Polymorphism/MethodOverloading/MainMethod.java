package Polymorphism.MethodOverloading;

import java.util.Arrays;

public class MainMethod {

    // main method can be overloaded

    public static void main(int no) {
        System.out.println("Number : " + no);
    }

    public static void main(String text) {
        System.out.println("Text : " + text);
    }

    public static void main(int[] arr) {
        System.out.println("Array : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        main(7);
        main("Hello");
        int[] arr = { 10, 20, 30, 40 };
        main(arr);
    }
}
