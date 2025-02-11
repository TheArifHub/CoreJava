package AbstractClass;

abstract class ATM {

    abstract void checkBalance();

    abstract void withDrawMoney(int money);

}

class BankAccount extends ATM {
    private int balance = 1000;

    void withDrawMoney(int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("Your amount withdraw success of " + money + " and balance is :" + balance);
        } else {
            System.out.println("Insufficient balance...");
        }
    }

    void checkBalance() {
        System.out.println("Balance in your Account is :" + balance);
    }
}

public class MyUser {
    public static void main(String[] args) {
        ATM atm = new BankAccount();
        atm.withDrawMoney(500);
        atm.checkBalance();
    }
}
