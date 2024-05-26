package lesson_4;

public class Animals {
    private String petName;

    public Animals(String petName) {
        this.petName = petName;
    }

    public void run(int len) {

        System.out.println(petName + " пробежал "  + len + " м");
    }

    public void swim(int len) {

        System.out.println(petName + " проплыл "  + len + " м");
    }
}
