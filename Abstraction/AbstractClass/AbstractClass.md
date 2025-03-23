# 🏛️ Abstract Class in Java

## 1️⃣ Concrete Method 🏗️
✔️ Any method that has both the **declaration** and **definition** is called a **Concrete Method**.

```java
public void method1() {
    System.out.println("Hello");
}
```

## 2️⃣ Concrete Class 🏛️
✔️ Any class that has only **concrete methods** is called a **Concrete Class**.

```java
public class Demo {
    public void method2() {
        System.out.println("Hello Java");
    }
}
```

## 3️⃣ Abstract Method 🎭
✔️ Any method declared with the keyword `abstract` is called an **Abstract Method**.

```java
abstract public void method3();
```

## 4️⃣ Abstract Class 🏛️🎭
✔️ Any class declared with the keyword `abstract` is called an **Abstract Class**.

```java
abstract class Sample {
}
```

## 🔹 Key Rules of Abstract Classes

5️⃣ If a class **contains** an abstract method, then the class **must** be declared as `abstract`, but the reverse is **not** necessarily true.

```java
abstract class Video {
    abstract void play();
}
```

6️⃣ An **abstract class** can have both **concrete methods** & **abstract methods**.

```java
abstract class Demo1 {
    abstract void method1();
    void method2() {
        System.out.println("Concrete method inside abstract class");
    }
}
```

7️⃣ We **cannot** create an object of an **abstract class**. ❌

8️⃣ An **abstract class** **can** have a **constructor**. ✅

9️⃣ We **cannot** declare an **abstract method** as `static`, `final`, or `private`. ❌

🔟 The class that provides **implementation** for an abstract method is called an **Implementation Class**.

1️⃣1️⃣ If any **abstract method** is **not overridden** in a subclass, then the subclass must also be declared as `abstract`. 🚨

---

## 📌 Real-Time Example: Abstract Class in Banking System 💰

```java
package Abstraction.AbstractClass;

// Abstract class (Super Class)
abstract class BankAccount {
    // Global variable
    double balance;

    // Constructor for the super class
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method
    abstract public void withDraw(double amount);

    // Concrete method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: $" + amount + ", New Balance: $" + balance);
    }
}

// Subclass (Inheritance)
class SavingAccount extends BankAccount {
    public SavingAccount(double balance) {
        super(balance);
    }

    // Implementing the abstract method
    public void withDraw(double amount) {
        if (balance - amount > 500) {
            balance -= amount;
            System.out.println("Amount Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Minimum balance must be $500");
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
```

---

🎯 **Summary:**

✅ **Abstract Class** → Defined using `abstract class`
✅ **Abstract Method** → Declared but not implemented (must be overridden)
✅ **Concrete Method** → Has both declaration & implementation
✅ **Cannot instantiate** an Abstract Class
✅ **Used for inheritance & method implementation enforcement**

🎉 Happy Coding! 👨‍💻🔥

