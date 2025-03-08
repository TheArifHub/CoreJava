package Inheritance.MultiLevelIheritance;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Car extends Vehicle {
    // move();
    void fuel() {
        System.out.println("Car uses petrol/diesel");
    }
}

class ElectricCar extends Car {
    // fuel();
    void battery() {
        System.out.println("Electric car uses battery");
    }
}

public class Driver {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.fuel();
        electricCar.battery();
    }
}
