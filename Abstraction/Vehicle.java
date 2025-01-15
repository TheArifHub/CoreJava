package Abstraction;

abstract class Car {
    abstract void speed(int rpm);

    abstract void handbreak();
}

abstract class Suv extends Car {
    void speed(int rpm) {
        System.out.println("Speed incresed by " + rpm);
    }
    // abstract void handbreak();
}

public class Vehicle extends Suv {
    // void speed()
    void handbreak() {
        System.out.println("Handbreak applied");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.speed(100);
        vehicle.handbreak();
    }
}
