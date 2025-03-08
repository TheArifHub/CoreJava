package Polymorphism.MethodOverRiding;

public class Employee {
    
    public void work()
    {
        System.out.println("Employee is working");
    }

    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.work();
    }
}
class Developer extends Employee{
    public void work()
    {
        super.work();
        System.out.println("Developer is coding");
    }
}
