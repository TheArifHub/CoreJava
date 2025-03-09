package SmallProjects.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private final ArrayList<Employee> employeeList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Enter Employee Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Department: ");
        String department = scanner.nextLine();
        System.out.println("Enter the Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, salary);
        employeeList.add(employee);
        System.out.println("Employee added successfully!\n");
    }

    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.\n");
            return;
        }
        System.out.println("Employee List:");

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    public void searchEmployee() {
        System.out.println("Enter Employee Id to Search: ");
        int id = scanner.nextInt();

        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println("Employee Found: " + emp);
                return;
            }
        }
        System.out.println("Employee Not Found!\n");
    }

    public void updateEmployee() {
        System.out.println("Enter Employee Id to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println("Enter New Name: ");
                emp.setName(scanner.nextLine());
                System.out.println("Enter New Department: ");
                emp.setDepartment(scanner.nextLine());
                System.out.println("Enter New Salary: ");
                emp.setSalary(scanner.nextDouble());
                System.out.println("Employee Updated Successfully!\n");
                return;
            }
        }
        System.out.println("Employee Not Found!\n");
    }

    public void deleteEmployee() {
        System.out.println("Enter Employee Id to Delete: ");
        int id = scanner.nextInt();
        employeeList.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee Deleted Successfully!\n");
    }

    public void menu() {
        while (true) {
            System.out.println("\n*** Employee Management System ***");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> searchEmployee();
                case 4 -> updateEmployee();
                case 5 -> deleteEmployee();
                case 6 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invlaid Choice! Try Again.");
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.menu();
    }

}
