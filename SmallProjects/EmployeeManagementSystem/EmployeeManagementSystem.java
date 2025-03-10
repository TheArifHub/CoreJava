package SmallProjects.EmployeeManagementSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private final ArrayList<Employee> employeeList;
    private final Scanner scanner;
    private static final String FILE_NAME = System.getProperty("user.dir") + "/employees.dat";

    public EmployeeManagementSystem() {
        this.scanner = new Scanner(System.in);
        this.employeeList = loadEmployees(); // Load employees when program starts
    }

    private void saveEmployees() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employeeList);
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Employee> loadEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void addEmployee() {
        System.out.println("Enter Employee Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println("Employee ID already exists! Try again.\n");
                return;
            }
        }

        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Department: ");
        String department = scanner.nextLine();
        System.out.println("Enter the Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, department, salary);
        employeeList.add(employee);
        saveEmployees(); // Save after adding
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
                saveEmployees(); // Save after updating
                System.out.println("Employee Updated Successfully!\n");
                return;
            }
        }
        System.out.println("Employee Not Found!\n");
    }

    public void deleteEmployee() {
        System.out.println("Enter Employee Id to Delete: ");
        int id = scanner.nextInt();
        boolean removed = employeeList.removeIf(emp -> emp.getId() == id);

        if (removed) {
            saveEmployees(); // Save after deleting
            System.out.println("Employee Deleted Successfully!\n");
        } else {
            System.out.println("Employee Not Found!\n");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n*** Employee Management System ***");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
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
                    System.out.println("Saving data and exiting... Thank you!");
                    saveEmployees(); // Save before exiting
                    return;
                }
                default -> System.out.println("Invalid Choice! Try Again.");
            }
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();
        system.menu();
    }
}
