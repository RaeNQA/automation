package lesson_4.task2;

public class Main {
    public static void main(String[] args) {
        Calculate krug = new Krug(10, "Синий", "Красный");
        Calculate pryamoug = new Pryamoug(4, 6, "Белый", "Зелёный");
        Calculate treug = new Treug(3, 4, 5, "Желтый", "Розовый");

        System.out.println("Круг:");
        System.out.println("Периметр: " + krug.cPerim());
        System.out.println("Площадь: " + krug.cArea());
        System.out.println("Цвет фона: " + krug.getfColor());
        System.out.println("Цвет границ: " + krug.getbColor());

        System.out.println();

        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + pryamoug.cPerim());
        System.out.println("Площадь: " + pryamoug.cArea());
        System.out.println("Цвет фона: " + pryamoug.getfColor());
        System.out.println("Цвет границ: " + pryamoug.getbColor());

        System.out.println();

        System.out.println("Треугольник:");
        System.out.println("Периметр: " + treug.cPerim());
        System.out.println("Площадь: " + treug.cArea());
        System.out.println("Цвет фона: " + treug.getfColor());
        System.out.println("Цвет границ: " + treug.getbColor());
    }
}
