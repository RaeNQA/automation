package Main;

public class task3 {
    public static void printColor() {
        int value = 10;             // при изменении числа меняется резултат.
        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }
}

