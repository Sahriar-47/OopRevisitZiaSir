class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car myCar = new Car(); // object creation
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
    }
}

