package Abstraction.AbstractClass;

// abstract class and super class
abstract class BankAccount {

    // Declared a global variable
    double balance;

    // super class constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // abstract method
    abstract public void withDraw(double amount);

    // concrete method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount : " + amount + " , New Balance : " + balance);
    }
}

// sub class with single level Inheritance
class SavingAccount extends BankAccount {

    // sub class constructor
    public SavingAccount(double balance) {
        // calling super class constructor
        super(balance);
    }

    // Implementing abstract method
    public void withDraw(double amount) {
        if (balance - amount > 500) {
            balance -= amount;
            System.out.println("Amount With Drawn : $" + amount + ", New Balance : $" + balance);
        } else {
            System.out.println("Minimum amount must $ 500");
        }
    }

}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new SavingAccount(2000);
        account.deposit(2000);
        account.withDraw(1536);
    }
}
