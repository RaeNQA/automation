package lesson6.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Dmitrov", "33-123-45-67");
        directory.add("Ivanov", "13-123-45-37");
        directory.add("Smirnov", "34-123-45-60");
        directory.add("Jacson", "54-123-35-99");
        directory.add("Johnson", "22-123-95-67");
        directory.add("Petrov", "34-773-25-53");
        directory.add("Petrov", "11-098-25-20");
        directory.add("Johnson", "13-33-553-25-17");
        directory.add("Smith", "32-33-723-65-63");

        printNumbers(directory.get("Smith"), "Smith");
        printNumbers(directory.get("Johnson"), "Johnson");
        printNumbers(directory.get("Petrov"), "Petrov");
    }

    private static void printNumbers(List<String> numbers, String lastName) {
        System.out.println("Numbers for last name " + lastName + ": " + numbers);
    }
}
