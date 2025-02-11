package Inheritance;

class Vehicle {
    
    String type;

    public Vehicle(String type) {
        this.type = type;
    }
}

class Car extends Vehicle {

    public Car(String type) {
        super(type);
    }
}

class ElectricCar extends Car {

    int speed;

    ElectricCar(int speed, String type) {
        super(type);
        this.speed = speed;
    }

    void details() {
        System.out.println("The vehicle type is " + type);
        System.out.println("And the speed is " + speed);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar(100, "SUV");
        car.details();
    }
}
