# 🔗 Interface in Java

## 📝 What is an Interface?
✔️ An **Interface** is one of the Java types.
✔️ It is declared using the `interface` keyword.
✔️ An Interface is a **pure abstract body** (100% abstraction). 🎭
✔️ In an Interface, we can define **only two** members:
   - **Variables** (implicitly `public static final`)
   - **Methods** (implicitly `public abstract`)
✔️ Interfaces **do not** support constructors or instance blocks.
✔️ We **cannot** create an object of an Interface. ❌
✔️ Java provides a special keyword **`implements`** to **inherit** properties from an Interface to a class. 📌
✔️ To **inherit** properties from one Interface to another, we use `extends`. 🔄
✔️ **Every class** in Java extends `Object` class, but an **Interface does not extend any class**.
✔️ An Interface is considered the **super-most type** in Java. 🚀
✔️ Using Interfaces, we achieve **100% abstraction**. ✅

---

## 📌 Example: Interface in Java

```java
interface Bank {

    public static final double MIN_AMOUNT = 500;

    void deposit(double amount);

    void withDraw(double amount);

    static void bankDetail() {
        System.out.println("Welcome to our bank! We provide savings and current accounts.");
    }

    default void bankPolicy() {
        System.out.println("Minimum balance must be $" + MIN_AMOUNT);
    }
}

class SavingAccount implements Bank {

    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    public void withDraw(double amount) {
        if (balance - amount > MIN_AMOUNT) {
            balance -= amount;
            System.out.println("Amount Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient Balance! Minimum balance should be $" + MIN_AMOUNT);
        }
    }
}

class CurrentAccount implements Bank {

    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }

    public void withDraw(double amount) {
        if (balance - amount > MIN_AMOUNT) {
            balance -= amount;
            System.out.println("Amount Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient Balance! Minimum balance should be $" + MIN_AMOUNT);
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Bank.bankDetail();
        Bank savingAccount = new SavingAccount(5000);
        savingAccount.bankPolicy();

        savingAccount.deposit(500);
        savingAccount.withDraw(2500);

        Bank currentAccount = new CurrentAccount(10000);
        currentAccount.withDraw(10800);
    }
}
```

---

## 🎯 Summary:

✅ **Interfaces** provide 100% abstraction.
✅ **Methods** in an Interface are `public` and `abstract` by default.
✅ **Variables** in an Interface are `public static final` by default.
✅ **Implements** is used for class inheritance from an Interface.
✅ **Extends** is used for Interface-to-Interface inheritance.
✅ **No constructors or objects** for Interfaces.

🎉 Happy Coding! 👨‍💻🔥