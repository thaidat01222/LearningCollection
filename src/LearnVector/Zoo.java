package LearnVector;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal = new Bird();
        Runnable runnable = new Dog();
        runnable.run();

        Flyable flyable = new Bird();
        flyable.fly();
    }
}
