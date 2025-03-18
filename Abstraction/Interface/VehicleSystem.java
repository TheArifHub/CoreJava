interface Vehicle {

    abstract void rent(double amount);

    static void vehicleDetails() {
        System.out.println("Bike Price $ 1000");
        System.out.println("Car Price $ 2000");
    }

}

class Bike implements Vehicle {

    final double bikePrice = 1000;

    public void rent(double amount) {
        if (bikePrice == amount) {
            System.out.println("Bike Booked Success...!");
        } else {
            System.out.println("Enter Proper Amount...!");
        }
    }
}

class Car implements Vehicle {

    final double carPrice = 2000;

    public void rent(double amount) {
        if (carPrice == amount) {
            System.out.println("Car Booked Success...!");
        } else {
            System.out.println("Enter Proper Amount...!");
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle.vehicleDetails();
        Vehicle bike = new Bike();
        bike.rent(1000);

        Vehicle car = new Car();
        car.rent(1800);
    }
}
