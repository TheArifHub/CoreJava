package Abstraction.AbstractClass;

// abstract class and super class
abstract class Vehicle {

    // abstract method
    abstract public void start();

    // concrete method
    public void stop() {
        System.out.println("Vehicle Stopped...!");
    }
}

// sub class with Hierarchical Inheritance
class Car extends Vehicle {

    // implementing abstract method
    public void start() {
        System.out.println("Car starts with the key...!");
    }
}

// sub class with Hierarchical Inheritance
class Bike extends Vehicle {

    // implementing abstract method
    public void start() {
        System.out.println("Bike starts with the self-start...!");
    }
}

public class Driver {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.stop();

        vehicle = new Car();
        vehicle.start();
        vehicle.stop();

    }
}
