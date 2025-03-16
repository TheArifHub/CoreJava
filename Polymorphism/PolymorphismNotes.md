# 🚀 Polymorphism in Java

**Poly** → many,
**Morphism** → forms

An object showing different behavior at different stages of its lifecycle is called **Polymorphism**. 🔄

---

## 🛠️ Types of Polymorphism

Polymorphism is categorized into two types:

1. **Compile-time Polymorphism** (Static polymorphism) ⚡
2. **Run-time Polymorphism** (Dynamic polymorphism) ⏳

---

## ⚡ Compile-time Polymorphism (Method Overloading)

✔️ The method declaration gets bound to its definition **at compile-time** by the compiler based on the arguments passed. This is called **Compile-time Polymorphism**.

✔️ Since the method gets bound at **compile-time**, it is known as **Early Binding**.

✔️ Once the method declaration gets bound to its definition, it **cannot be re-bound**, hence it is also known as **Static Binding**.

✔️ **Method Overloading** is an example of Compile-time Polymorphism. 📝

### 📌 Real-time Example: Compile-time Polymorphism

```java
package Polymorphism.MethodOverloading;

public class WhatsApp {

    public void send(String message) {
        System.out.println(message);
    }

    public void send(int no, String message) {
        System.out.println("Your number: " + no + ", " + message);
    }

    public static void main(String[] args) {
        WhatsApp app = new WhatsApp();
        app.send("Hello");
        app.send(456, "This is my OTP");
    }
}
```

---

## ⏳ Run-time Polymorphism (Method Overriding)

✔️ The method declaration gets bound to its definition **at runtime** by the **JVM**, based on the object created. This is called **Run-time Polymorphism**.

✔️ Since the method gets bound **at runtime**, it is known as **Late Binding**.

✔️ Once the method declaration gets bound to its definition, it **can be re-bound**, hence it is called **Dynamic Binding**.

✔️ **Method Overriding** is an example of Run-time Polymorphism. 🔄

### 📌 Real-time Example: Run-time Polymorphism

```java
package Polymorphism.MethodOverRiding;

public class Animal {
    public void noise() {
        System.out.println("Some noise...");
    }
}

class Dog extends Animal {
    public void noise() {
        super.noise();
        System.out.println("Dog barks 🐶");
    }
}

class Cat extends Animal {
    public void noise() {
        super.noise();
        System.out.println("Cat meows 🐱");
    }
}

class Snake extends Animal {
    public void noise() {
        super.noise();
        System.out.println("Snake hisses 🐍");
    }
}

class Tester {
    public void ok(Animal a) {
        a.noise();
    }
}

class MainClass {
    public static void main(String[] args) {
        Tester obj = new Tester();
        obj.ok(new Cat());
    }
}
```

---

### 🎯 Key Takeaways

🔹 **Method Overloading** → Compile-time Polymorphism ⚡

🔹 **Method Overriding** → Run-time Polymorphism ⏳

🔹 **Early Binding vs. Late Binding** 🔄

🔹 **Static vs. Dynamic Behavior** 🔀

Hope this helped! 🎉 Happy coding! 👨‍💻🔥

