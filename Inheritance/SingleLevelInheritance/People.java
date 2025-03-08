package Inheritance.SingleLevelInheritance;

class Phone {
    static void call() {
        System.out.println("Calling...");
    }
}

class SmartPhone extends Phone {
    // call();
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
