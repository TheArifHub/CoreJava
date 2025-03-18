interface Payment{

    abstract void pay(double amount);
}

class CreditCard implements Payment{

    public void pay(double amount) {
        System.out.println("Amount $ "+amount+" Payed by Credit Card");
    }
}

class Upi implements Payment{

    public void pay (double amount){
        System.out.println("Amount $ "+amount+" Payed by UPI");
    }
}

class PassByReffrence{
    public static void m1(Payment payment,double amount)
    {
        payment.pay(amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        Upi upi = new Upi();

        PassByReffrence.m1(upi, 500);
        PassByReffrence.m1(card, 1000);
    }
}
