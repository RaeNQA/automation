package tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println(aSum(3, 5));         // вернет 8 false
        System.out.println(aSum(15, 1));        //вернет 16 true

        }
    public static boolean aSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
