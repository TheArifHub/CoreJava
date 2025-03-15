package Abstraction.AbstractClass;

// abstract class and super class
abstract class Employee {

    // declared global variable
    String name;
    double salary;

    // super class constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // abstract method
    public abstract double calculateBonus();
}

// sub class with hierarchical inheritance
class Developer extends Employee {

    // sub class constructor
    public Developer(String name, double salary) {
        // calling super class constructor
        super(name, salary);
    }

    // implemening abstract method
    public double calculateBonus() {
        return 0.10;
    }
}

// sub class with hierarchical inheritance
class Manager extends Employee {

    // sub class constructor
    public Manager(String name, double slary) {
        // calling super class constructor
        super(name, slary);
    }

    // implemening abstract method
    public double calculateBonus() {
        return 0.20;
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee = new Developer("Arif", 20000);
        System.out.println("Employee Name : " + employee.name + " ,salary : $" + employee.salary
                + ", Bonus percentage : " + employee.calculateBonus() * 100 + "%");

        employee = new Manager("Syed", 50000);
        System.out.println("Employee Name : " + employee.name + " ,salary : $" + employee.salary
                + ", Bonus percentage : " + employee.calculateBonus() * 100 + "%");
    }
}
