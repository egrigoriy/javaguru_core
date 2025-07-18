package module_3.animals;

public class AnimalsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();
        Cat cat = new Cat();
        cat.voice();
        dog.voice("BUA-BAU");
        dog.voice(3);
    }
}
