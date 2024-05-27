package lesson_4.task1;

class Animals {
    protected int runLimit;
    protected int swimLimit;
    protected String petName;

    public Animals(String petName) {
        this.petName = petName;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Животное " + petName + " пробежало " + distance + " м.");
        } else {
            System.out.println("Животное " + petName + " не может пробежать такое расстояние.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println("Животное " + petName + " проплыло " + distance + " м.");
        } else {
            System.out.println("Животное " + petName + " не может проплыть такое расстояние.");
        }
    }
}