package Inheritance.HierarchicalInheritance;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...!");
    }
}

class Car extends Vehicle {
    // move();
    void fourWheel() {
        System.out.println("Driving a car...!");
    }
}

class Bike extends Vehicle {
    // move()
    void twoWheel() {
        System.out.println("Driving a bike...!");
    }
}

public class Driver {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.move();
        bike.twoWheel();

        Car car = new Car();
        car.move();
        car.fourWheel();
    }
}
