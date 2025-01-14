package MethodOverRiding;

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.03;
    }
}

class SavingAccount extends BankAccount {

    SavingAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.06;
    }

}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    double calculateInterest() {
        return balance * 0.09;
    }
}

public class MyUser {
    public static void main(String[] args) {
        BankAccount generalAccount = new BankAccount(1000);
        SavingAccount savingAccount = new SavingAccount(1000);
        CurrentAccount currentAccount = new CurrentAccount(1000);

        System.out.println("General Account Interest :" + generalAccount.calculateInterest());
        System.out.println("Saving Account Interest :" + savingAccount.calculateInterest());
        System.out.println("Current Account Interest :" + currentAccount.calculateInterest());

    }
}
