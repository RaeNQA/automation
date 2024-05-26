package lesson_4;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        barsik.run(150);

        Dog chack = new Dog("Чак");
        chack.run(400);

        barsik.swim();
        chack.swim(10);
    }
}
