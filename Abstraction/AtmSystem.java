package Abstraction;

abstract interface AtmMachine {

    abstract public void withDraw(double amount);

    abstract public void deposit(double amount);

    abstract public void chechBalance();
}

class SbiAtm implements AtmMachine {

    private double balance = 10000;

    @Override
    public void withDraw(double amount) {
        if (amount < balance && amount != 0) {
            balance -= amount;
            System.out.println("Amount withdraw success : $ " + balance);
            System.out.println("New balacne : $ " + balance);
        } else {
            System.out.println("Insufficient Balance...!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Depoisted : $ " + amount);
        System.out.println("New balance : $ " + balance);
    }

    @Override
    public void chechBalance() {
        System.out.println("Balance : $ " + balance);
    }
}

class KarnatakaAtm implements AtmMachine {

    private double balacne = 20000;

    @Override
    public void withDraw(double amount) {
        if (amount < balacne && amount != 0) {
            balacne -= amount;
            System.out.println("Amount Withdrawn : $ " + amount);
            System.out.println("New Balance : $ " + balacne);
        } else {
            System.out.println("Insufficient Balance...!");
        }
    }

    @Override
    public void deposit(double amount) {
        balacne += amount;
        System.out.println("Amount Deposited : $ " + amount);
        System.out.println("New Balance : $ " + balacne);
    }

    @Override
    public void chechBalance() {
        System.out.println("Balance : $ " + balacne);
    }
}

public class AtmSystem {
    public static void main(String[] args) {
        AtmMachine atm;

        atm = new SbiAtm();
        atm.chechBalance();
        atm.deposit(500);
        atm.withDraw(2000);

        atm = new KarnatakaAtm();
        atm.chechBalance();
        atm.deposit(5000);
        atm.withDraw(8000);
    }
}
