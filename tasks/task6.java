package tasks;

public class task6 {
    public static void main(String[] args) {
        int number = 10;
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
