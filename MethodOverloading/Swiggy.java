public class Swiggy {
    public static void order(int qty) {
        System.out.println("The quantity of your order is " + qty);
    }

    public static void order(String foodName) {
        System.out.println("The food name of your order is " + foodName);
    }

    public static void order(String[] foodNames, int[] qtys) {
        for (String foodName : foodNames) {
            System.out.print(foodName + " ");
        }
        for (int qty : qtys) {
            System.out.print(qty + " ");
        }
    }

    public static void main(String[] args) {
        Swiggy.order(5);
        Swiggy.order("Biryani");
        Swiggy.order(new String[] { "Pizza", "Burger", "cold Drinks" }, new int[] { 4, 5, 6 });
    }
}
