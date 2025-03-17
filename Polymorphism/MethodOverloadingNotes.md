# 🚀 Method Overloading  

Developing multiple methods with the same name but with variations in the argument list is called **method overloading**.  

### 🔹 Variations in the argument list:  
✅ **Variation in the data type**  
✅ **Variation in the number of arguments**  
✅ **Variation in the order of occurrence of arguments**  

### 📜 Rules for Method Overloading:  
🔹 The method name **must be the same**.  
🔹 There **must be** a variation in the argument list.  
🔹 **No restrictions** on access specifier, modifier, or return type.  

### ⚡ Important Notes:  
💡 We can **overload both static and non-static methods**.  
💡 We can even **overload the `main` method**!  

---

## 🌟 Real-Time Example of Method Overloading  

```java
package Polymorphism.MethodOverloading;

public class Swiggy {

    public static void order(int qty, String foodName) {
        System.out.println("Quantity: " + qty + " and " + foodName);
    }

    public static void order(String coldDrink) {
        System.out.println("Order placed: " + coldDrink);
    }

    public static void order(int qty, String foodName, String coldDrink) {
        System.out.println("Quantity: " + qty + ", " + foodName + " and " + coldDrink);
    }

    public static void main(String[] args) {
        order("Redbull");
        order(5, "Biryani");
        order(2, "Pizza", "Pepsi");
    }
}
```

This version is more engaging and visually appealing. Let me know if you want any more changes! 😊🚀