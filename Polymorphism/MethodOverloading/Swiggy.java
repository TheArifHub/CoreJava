package Polymorphism.MethodOverloading;

public class Swiggy {

    public static void order(int qty, String foodName) {
        System.out.println("Quantity : " + qty + " and " + foodName);

    }

    public static void order(String coldDrink) {
        System.out.println("ordered placed : " + coldDrink);
    }

    public static void order(int qty, String foodName, String coldDrink) {
        System.out.println("Quantity : " + qty + ", " + foodName + " and " + coldDrink);
    }

    public static void main(String[] args) {
        order("Redbull");
        order(5, "Biryani");
        order(2, "Pizza", "Pepsi");
    }
}
