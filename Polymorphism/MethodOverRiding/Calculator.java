package Polymorphism.MethodOverRiding;

class Casio {
    void operation() {
        System.out.println("Add");
    }
}

class CasioV1 extends Casio {
    void operation() {
        super.operation();
        System.out.println("Subtract");
    }
}

class CasioV2 extends CasioV1 {
    void operation() {
        super.operation();
        System.out.println("Multiplication");
    }
}

public class Calculator {
    public static void main(String[] args) {
        CasioV2 v2 = new CasioV2();
        v2.operation();
    }
}
