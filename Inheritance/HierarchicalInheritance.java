package Inheritance;

class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is writing the code and his salary is " + salary);
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is managing the team and his salay is " + salary);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer("Arif", 100000);
        dev.work();
        Manager manage = new Manager("xyz", 150000);
        manage.work();
    }
}
