# 🎭 Abstraction in Java

## 📝 What is Abstraction?
✔️ **Abstraction** is one of the fundamental **OOP** concepts.
✔️ It **hides the complexity** of a system and **exposes only the required functionality** to the end user. 🎭
✔️ To achieve **Abstraction**, develop all the essential features in an **Interface** and provide the implementation in a **subclass**.
✔️ By using an **Interface**, we can achieve **100% Abstraction**. ✅

---

## 📌 Example: Abstraction in Java

```java
package Abstraction;

interface AtmMachine {
    void withDraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

class SbiAtm implements AtmMachine {
    private double balance = 10000;

    @Override
    public void withDraw(double amount) {
        if (amount < balance && amount != 0) {
            balance -= amount;
            System.out.println("Amount Withdrawal Successful: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient Balance...!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class KarnatakaAtm implements AtmMachine {
    private double balance = 20000;

    @Override
    public void withDraw(double amount) {
        if (amount < balance && amount != 0) {
            balance -= amount;
            System.out.println("Amount Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient Balance...!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }
}

public class AtmSystem {
    public static void main(String[] args) {
        AtmMachine atm;

        atm = new SbiAtm();
        atm.checkBalance();
        atm.deposit(500);
        atm.withDraw(2000);

        atm = new KarnatakaAtm();
        atm.checkBalance();
        atm.deposit(5000);
        atm.withDraw(8000);
    }
}
```

---

## 🎯 Summary:

✅ **Abstraction** hides complexity and shows only necessary details.
✅ Achieved using **Interfaces** and **Abstract Classes**.
✅ **100% Abstraction** is achieved through Interfaces.
✅ Used for designing **loosely coupled** systems.

🎉 Happy Coding! 👨‍💻🔥
