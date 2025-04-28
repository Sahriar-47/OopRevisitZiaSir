abstract class Animal2 {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog2 extends Animal2 {
    void makeSound() {
        System.out.println("Bark Bark");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.makeSound();
        d.sleep();
    }
}