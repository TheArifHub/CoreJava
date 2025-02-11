package Inheritance;

class Vehicle {
    int wheels;
    String type;

    public Vehicle(int wheels, String type) {
        this.wheels = wheels;
        this.type = type;
    }

    public void vehicleDetails() {
        System.out.println("No of wheels :" + wheels);
        System.out.println("Vehicle body type :" + type);
    }
}

class Car extends Vehicle {

    String model;

    public Car(int wheels, String type, String model) {
        super(wheels, type);
        this.model = model;
    }

    public void details() {
        vehicleDetails();
        System.out.println("Car Model is :" + model);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Car car = new Car(4, "SUV", "Fortuner");
        car.details();
    }
}
