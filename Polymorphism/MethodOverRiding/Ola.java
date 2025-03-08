package Polymorphism.MethodOverRiding;

class Book{
    public void ride()
    {
        System.out.println("Book your ride");
    }
}

class Car extends Book{
    public void ride()
    {
        super.ride();
        System.out.println("Car Booked Success");
    }
}

class Bike extends Book{
    public void ride()
    {
        super.ride();
        System.out.println("Bike Booked Success");
    }
}

public class Ola {
    public static void main(String[] args) {
        Book obj = new Bike();
        obj.ride();
    }
}
