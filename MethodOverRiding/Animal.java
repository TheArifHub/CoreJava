package MethodOverRiding;

class DomesticAnimal {
    void noise() {
        System.out.println("Some noise....");
    }
}

class Dog extends DomesticAnimal {
    void noise() {
        super.noise();
        System.out.println("bow bow bow....");
    }
}

class Cat extends DomesticAnimal {
    void noise() {
        // super.noise();
        System.out.println("meow meow meow....");
    }
}

class Cow extends DomesticAnimal {
    void noise() {
        // super.noise();
        System.out.println("moo moo moo....");
    }
}

class Simulator {
    static void ansim(DomesticAnimal animal) {
        animal.noise();
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Simulator.ansim(dog);
        Simulator.ansim(cat);
        Simulator.ansim(cow);

    }
}
