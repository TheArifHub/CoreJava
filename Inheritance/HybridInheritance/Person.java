package Inheritance.HybridInheritance;

class Vehicle {
    void drive() {
        System.out.println("Driving!...");
    }
}

class Car extends Vehicle {
    // drive();
    void fuel() {
        System.out.println("Car...");
    }
}

class ElectricCar extends Car {
    // drive();
    // fuel();
    void battery() {
        System.out.println("Electric Car...");
    }
}

class Bike extends Vehicle {
    // drive();
    void petrol() {
        System.out.println("Bike...");
    }
}

public class Person {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.drive();
        bike.petrol();

        ElectricCar car = new ElectricCar();
        car.drive();
        car.fuel();
        car.battery();
    }
}
