interface Animal3 {
    void sound();
}

class Cat implements Animal3 {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}