# 🔒 Encapsulation in Java

## 📝 What is Encapsulation?
✔️ **Encapsulation** is the process of **hiding** the data members by declaring them `private` and providing **indirect access** through public methods called **getters** and **setters**. 🔐
✔️ This protects data from **direct modification** outside the class. ✅

## 🔹 Key Features:
✔️ Encapsulation is one of the fundamental **OOP principles**. 🎭
✔️ Java is **by default** an **encapsulated** language.
✔️ We **cannot** declare methods outside a class. ❌
✔️ We **cannot** print statements outside a method. 🚫
✔️ `get` method → Used to **retrieve** values. 📥
✔️ `set` method → Used to **modify** values. 📤

---

## 🏛️ What is a Java Bean Class?
✔️ Wrapping up **data members** and **function members** in a **single unit** is called a **Java Bean Class**. 🎁

---

## 📌 Example: Encapsulation in Java

```java
class Account {

    private String email;
    private String password;
    private String confirmPassword;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void register(String enteredEmail, String enteredPassword, String enteredConfirmPassword) {
        if (enteredPassword.equals(enteredConfirmPassword)) {
            setPassword(enteredPassword);
            setConfirmPassword(enteredConfirmPassword);
            setEmail(enteredEmail);
            System.out.println("Registered successfully!");
        } else {
            System.out.println("Password and Confirm Password do not match!");
        }
    }

    public void signIn(String enteredEmail, String enteredPassword) {
        if (getEmail().equals(enteredEmail) && getPassword().equals(enteredPassword)) {
            System.out.println("Sign-in Successful! ✅");
        } else {
            System.out.println("Invalid Credentials ❌");
        }
    }
}

public class Instagram {
    public static void main(String[] args) {
        Account account = new Account();

        account.register("arif@gmail.com", "arif$123", "arif$123");
        
        account.signIn("aaru@gmail.com", "153");
        account.signIn("arif@gmail.com", "arif$123");
    }
}
```

---

## 🎯 Summary:

✅ **Encapsulation** restricts direct access to data members.
✅ Provides **controlled access** via `getters` & `setters`.
✅ Helps in **data protection & security**. 🔐
✅ Achieved using **private variables** & **public methods**.
✅ Used in **Java Bean Classes** for better structure. 📦

🎉 Happy Coding! 👨‍💻🔥

