package Inheritance.HierarchicalInheritance;

class Empolyee {
    static void work() {
        System.out.println("Employee's are working...");
    }
}

class Manager extends Empolyee {
    // work();
    static void metting() {
        System.out.println("In Metting...");
    }
}

class Developer extends Empolyee {
    // work();
    static void code() {
        System.out.println("Coding...");
    }
}

public class Company {
    public static void main(String[] args) {
        Developer.work();
        Developer.code();

        Manager.work();
        Manager.metting();
    }
}
