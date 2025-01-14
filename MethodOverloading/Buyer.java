class Amazon {
    public void addToChart(int qty, String productName) {
        System.out.println("Your quantity is " + qty + " for this product " + productName);
    }

    public void addToChart(String[] productsName) {
        for (String product : productsName) {
            System.out.print(product + " ");
        }
        System.out.println();
    }

    public void addToChart(double amount, int qty, String productName) {
        System.out.println("Your amount " + amount + " for the quantity " + qty + " of product " + productName);
    }
}

public class Buyer {
    public static void main(String[] args) {
        Amazon cart = new Amazon();
        cart.addToChart(5, "pen");
        cart.addToChart(new String[] { "shoes", "shirt", "pant" });
        cart.addToChart(550.5, 10, "keyboard");
    }
}
