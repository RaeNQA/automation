package lesson_4;

public class Cat extends Animals {
    public Cat(String petName) {
        super(petName);
    }

    public void run(int len) {
        if (len <= 200) {
            super.run(len);
        }
    }

    public void swim() {
        System.out.println("кот не умеет плавать");
    }

    public void swim(int len) {
        swim();
    }
}
