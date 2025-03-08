package Inheritance.SingleLevelInheritance;

class Animal {
    void sound() {
        System.out.println("some noise....!");
    }
}

class Dog extends Animal {
    // sound();
    void bark() {
        System.out.println("Dog Barks....!");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark();
    }
}
