# 🏆 **Inheritance in Java**  

📌 **Definition:** Inheriting properties from one class to another is called **Inheritance**.  
📌 **It is also known as an "Is-A" Relationship** in Java.  
📌 **Keyword used:** `extends`  
📌 **Main Benefit:** Code **reusability** 🔄  

---

## 🔹 **Types of Inheritance in Java**  

Java supports five types of inheritance:  
1️⃣ **Single Level Inheritance**  
2️⃣ **Multi-Level Inheritance**  
3️⃣ **Hierarchical Inheritance**  
4️⃣ **Multiple Inheritance (through Interfaces)**  
5️⃣ **Hybrid Inheritance (Combination of types)**  

---

## 1️⃣ **Single Level Inheritance**  
📌 A **subclass** inherits properties from a **single superclass**.  

🖼 **Diagram:**  
![Single Level Inheritance](ClassDiagram/single%20level%20inheritance.jpg)  

### ✅ **Example:**  

```java
package Inheritance.SingleLevelInheritance;

class Phone {
    static void call() {
        System.out.println("Calling...");
    }
}

class SmartPhone extends Phone {
    static void internet() {
        System.out.println("Searching...");
    }
}

public class People {
    public static void main(String[] args) {
        SmartPhone.call();
        SmartPhone.internet();
    }
}
```

---

## 2️⃣ **Multi-Level Inheritance**  
📌 A **subclass** inherits properties from a **superclass**, and that superclass **inherits from another superclass**.  

🖼 **Diagram:**  
![Multi Level Inheritance](ClassDiagram/multi%20level%20inheritance.jpg)  

### ✅ **Example:**  

```java
package Inheritance.MultiLevelInheritance;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("Car uses petrol/diesel");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric car uses battery");
    }
}

public class Driver {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.fuel();
        electricCar.battery();
    }
}
```

---

## 3️⃣ **Hierarchical Inheritance**  
📌 **Multiple subclasses inherit from a single superclass.**  

🖼 **Diagram:**  
![Hierarchical Inheritance](ClassDiagram/hierarchical%20inheritance.jpg)  

### ✅ **Example:**  

```java
package Inheritance.HierarchicalInheritance;

class Employee {
    static void work() {
        System.out.println("Employees are working...");
    }
}

class Manager extends Employee {
    static void meeting() {
        System.out.println("In a meeting...");
    }
}

class Developer extends Employee {
    static void code() {
        System.out.println("Coding...");
    }
}

public class Company {
    public static void main(String[] args) {
        Developer.work();
        Developer.code();

        Manager.work();
        Manager.meeting();
    }
}
```

---

## 4️⃣ **Multiple Inheritance (Using Interfaces)**  
📌 **A subclass inherits from multiple interfaces.**  
📌 Java **does not support multiple inheritance with classes**, but it is possible with **interfaces**.  

🖼 **Diagram:**  
![Multiple Inheritance](ClassDiagram/multiple%20inheritance.jpg)  

### ✅ **Example:**  

```java
package Inheritance.MultipleInheritance;

interface Phone {
    void call();
}

interface Computer {
    void browseInternet();
}

class SmartPhone implements Phone, Computer {
    public void call() {
        System.out.println("Calling...!");
    }

    public void browseInternet() {
        System.out.println("Searching...!");
    }
}

public class Arif {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.browseInternet();
    }
}
```

---

## 5️⃣ **Hybrid Inheritance**  
📌 A **combination of single, multi-level, and hierarchical inheritance.**  

🖼 **Diagram:**  
![Hybrid Inheritance](ClassDiagram/hybrid%20inheritance.jpg)  

### ✅ **Example:**  

```java
package Inheritance.HybridInheritance;

class Vehicle {
    void drive() {
        System.out.println("Driving!...");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("Car...");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric Car...");
    }
}

class Bike extends Vehicle {
    void petrol() {
        System.out.println("Bike...");
    }
}

public class Person {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.drive();
        bike.petrol();

        ElectricCar car = new ElectricCar();
        car.drive();
        car.fuel();
        car.battery();
    }
}
```

---

# 🎯 **Conclusion**  
✅ **Inheritance makes code reusable and organized.**  
✅ **It helps create hierarchical relationships between classes.**  
✅ **Java does not support multiple inheritance with classes, but it does with interfaces.**  
✅ **Understanding inheritance is key to mastering object-oriented programming!**  
