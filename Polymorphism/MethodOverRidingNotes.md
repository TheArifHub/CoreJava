# 🚀 **Method Overriding**  

Developing a method in a **subclass** with the **same name and signature** as in the **superclass** but with a different implementation is called **method overriding**.  

### 🔹 **Rules for Method Overriding**  
✅ **Method name and signature must be the same**  
✅ **There must be an "Is-A" relationship (Inheritance)**  
✅ **The method must always be non-static**  

### 📜 **Important Notes**  
💡 **We can override only non-static methods.**  
❌ **We cannot override static methods.**  
❌ **We cannot override the `main` method.**  
❌ **We cannot override constructors.**  

---

## 🌟 **Real-Time Example of Method Overriding**  

```java
package Polymorphism.MethodOverRiding;

class PostImage {
    public void post() {
        System.out.println("Image Posted Successfully!");
    }
}

class PostReel extends PostImage {
    public void post() {
        super.post();
        System.out.println("Reel Posted Successfully!");
    }
}

class PostIgtv extends PostReel {
    public void post() {
        super.post();
        System.out.println("IGTV Posted Successfully!");
    }
}

class Story extends PostIgtv {
    public void post() {
        super.post();
        System.out.println("Story Posted Successfully!");
    }
}

public class Instagram {
    public static void main(String[] args) {
        Story obj = new Story();
        obj.post();
    }
}
```