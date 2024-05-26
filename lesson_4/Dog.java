package lesson_4;

public class Dog extends Animals {

    public Dog(String petName) {
        super(petName);
    }

    public void run(int len) {
        if (len <= 500) {
            super.run(len);
        }

    }

    public void swim(int len) {
        if (len <= 10){
            super.swim(len);
        }

    }
}
