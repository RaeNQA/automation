package lesson_4.task2;

public class Main {
    public static void main(String[] args) {
        Calculate circle = new Krug(5, "red", "black");
        Calculate rectangle = new Pryamug(4, 6, "blue", "green");
        Calculate triangle = new Treug(3, 4, 5, "yellow", "purple");

        // Выводим характеристики каждой фигуры
        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Fill Color: " + circle.getColor());
        System.out.println("Border Color: " + circle.getBorderColor());

        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Fill Color: " + rectangle.getColor());
        System.out.println("Border Color: " + rectangle.getBorderColor());

        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Fill Color: " + triangle.getColor());
        System.out.println("Border Color: " + triangle.getBorderColor());
    }
}
