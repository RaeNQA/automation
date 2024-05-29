package lesson_4.task2;

public class Main {
    public static void main(String[] args) {
        Calculate krug = new Krug(4, "Синий", "Красный");
        Calculate pryamoug = new Pryamoug(4, 6, "Белый", "Зелёный");
        Calculate treug = new Treug(3, 4, 5, "Желтый", "Розовый");

        System.out.println("Круг:");
        krug.Display();
        System.out.println();

        System.out.println("Прямоугольник:");
        pryamoug.Display();
        System.out.println();

        System.out.println("Треугольник:");
        treug.Display();
        treug.cPerim();
    }
}
