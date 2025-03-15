package Abstraction.AbstractClass;

// abstract class and super class
abstract class App {

    // abstract method's
    abstract public void fanOn();

    abstract public void fanOff();
}

// sub class with single level inheritance
abstract class Fan1 extends App {

    // implementing abstract method
    public void fanOn() {
        System.out.println("Fan is On");
    }
}

// sub class with multi level inheritance
class Fan2 extends Fan1 {

    // implementing abstract method
    public void fanOff() {
        System.out.println("Fan is Off");
    }
}

public class SmartPhone {
    public static void main(String[] args) {
        App app = new Fan2();
        app.fanOn();
        app.fanOff();
    }
}
