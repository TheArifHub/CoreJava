interface Bank {

    public static final double minAmount = 500;

    void deposite(double amount);

    void withDraw(double amount);

    static void bankDetail() {
        System.out.println("Welcom to our bank we provide saving and current account ");
    }

    default void bankPolicy() {
        System.out.println("Minimum Amount must be $ " + minAmount);
    }
}

class SavingAccount implements Bank {

    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount) {
        balance += amount;
        System.out.println("Amount Deposited $ " + amount);
        System.out.println("New Balance $ " + balance);
    }

    public void withDraw(double amount) {
        if (balance - amount > minAmount) {
            balance -= amount;
            System.out.println("Amount With Drawn $ " + amount);
            System.out.println("New Balance $ " + balance);
        } else {
            System.out.println("Insufficient Balance! Minimum balance should be $ " + minAmount);
        }
    }

}

class CurrentAccount implements Bank {

    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount) {
        balance += amount;
        System.out.println("Amount Deposited $ " + amount);
        System.out.println("New Balance $ " + balance);
    }

    public void withDraw(double amount) {
        if (balance - amount > minAmount) {
            balance -= amount;
            System.out.println("Amount With Drawn $ " + amount);
            System.out.println("New Balance $ " + balance);
        } else {
            System.out.println("Insufficient Balance! Minimum balance should be $ " + minAmount);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Bank.bankDetail();
        Bank savingAccount = new SavingAccount(5000);
        savingAccount.bankPolicy();

        savingAccount.deposite(500);
        savingAccount.withDraw(2500);

        Bank currentAccount = new CurrentAccount(10000);
        currentAccount.withDraw(10800);

    }
}
