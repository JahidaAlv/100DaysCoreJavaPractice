package three.classdemo.abstraction;

// Abstraction hides the internal details and shows only essential features.

public class AbstractionDemo {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();

    }
}
