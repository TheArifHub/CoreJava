package Abstraction;

abstract interface Animal {
    abstract public void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Memow meow...");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bow bow...");
    }
}

class Snake implements Animal {
    public void sound() {
        System.out.println("Hizz hizz...");
    }
}

class Test {
    public static void m1(Animal a1) {
        a1.sound();
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Snake snake = new Snake();

        Test.m1(cat);
        Test.m1(dog);
        Test.m1(snake);
    }
}
