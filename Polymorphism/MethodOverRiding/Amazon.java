package Polymorphism.MethodOverRiding;

class Payment {
    public void pay() {
        System.out.println("Processing Payment...");
    }
}

class CreditCard extends Payment {
    public void pay() {
        System.out.println("Payment done by Credit Card");
    }
}

class Upi extends Payment {
    public void pay() {
        System.out.println("Payment done by Upi");
    }
}

class Cash extends Payment {
    public void pay() {
        System.out.println("Payment on cash on delivery");
    }
}

public class Amazon {
    public static void main(String[] args) {
        // upcasting
        Payment payment = new Upi();
        payment.pay();
    }
}
