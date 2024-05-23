package lesson_3;

public class Employ {
    private String fullName;
    private String position;
    private String eMail;
    private String number;
    private double salary;
    private int age;

    public Employ (String fullName, String position, String eMail, String number, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void Display() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + eMail);
        System.out.println("Телефон: " + number);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void Main() {
        Employ empDisplay = new Employ("Yanov Yanovich Yan", "AQA", "Test@mail.asd", "+12345566452", 50000, 33);
        empDisplay.Display();
    }
}


