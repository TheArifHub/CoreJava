class Atm {
    // Declare the data member as a private
    private int pin;
    private double balance;
    // and restrict the direct access outside the class and 
    // provide indirect access through getters and setters is called encapsulation
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Amount with drawn $ " + amount);
            }else{
                System.out.println("Insaficent balance!");
            }
        }else{
            System.out.println("Enter correct pin");
        }
    }
}

public class Sbi {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.setPin(123);
        System.out.println("Pin is set "+obj.getPin());
        obj.setBalance(5000);
        System.out.println("Amount Added : $ "+obj.getBalance());
        obj.withDraw(500, 123);
        System.out.println("Total Balance : $ "+obj.getBalance());
        
    }
}