package lesson_4.task1;

class Cat extends Animals {
    private boolean satiety;

    public Cat(String petName) {
        super(petName);
        runLimit = 200;
        swimLimit = 0;
        satiety = false;
    }

    public void eat(int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        } else {
            System.out.println("Кот " + petName + " покушал.");
            satiety = true;
        }
    }

    public boolean satiety() {
        return satiety;
    }
}
