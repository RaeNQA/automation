package lesson_4.task1;

public class Main {
    public static void main(String[] args) {
        // содание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");
        Cat catTom = new Cat("Том");

        Animals[] animals = {dogBobik, catBarsik, catTom};

        Food food = new Food(20);

        for (Animals animal : animals) {
            animal.run(250);
            animal.swim(5);
        }

        catBarsik.eat(15);
        catTom.eat(10);

        System.out.println("Сытость кота Барсика: " + catBarsik.satiety());
        System.out.println("Сытость кота Том: " + catTom.satiety());

        food.addFood(10);
        System.out.println("Остаток еды в миске: " + food.getFoodAmount());
    }
}