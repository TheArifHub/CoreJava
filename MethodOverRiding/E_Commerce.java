package MethodOverRiding;

class Flipkart {
    double price;

    Flipkart(double price) {
        this.price = price;
    }

    double offer() {
        return price * 0.02;
    }
}

class Fashion extends Flipkart {
    Fashion(double price) {
        super(price);
    }

    double offer() {
        return price * 0.05;
    }
}

class Electronic extends Flipkart {
    Electronic(double price) {
        super(price);
    }

    double offer() {
        return price * 0.08;
    }
}

class Grocery extends Flipkart {

    Grocery(double price) {
        super(price);
    }

    double offer() {
        return price * 0.03;
    }

}

public class E_Commerce {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(1000);
        Fashion fashion = new Fashion(2000);
        Electronic electronic = new Electronic(10000);
        Grocery grocery = new Grocery(500);

        System.out.println("Offer for anything you buy in Flipkart is :" + flipkart.offer());
        System.out.println("Offer for Fashion items are :" + fashion.offer());
        System.out.println("Offer for Electronic Device are :" + electronic.offer());
        System.out.println("Offer for Grocery's are :" + grocery.offer());
    }
}
