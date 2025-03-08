package Polymorphism.MethodOverRiding;

public class Animal {
    public void noise() {
        System.out.println("some noise...");
    }
}

class Dog extends Animal {
    public void noise() {
        super.noise();
        System.out.println("Dog barges");
    }
}

class Cat extends Animal {
    public void noise() {
        super.noise();
        System.out.println("cat meawo");
    }
}

class Snake extends Animal {
    public void noise() {
        super.noise();
        System.out.println("sizz");
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
