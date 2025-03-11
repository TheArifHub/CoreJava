package SmallProjects.StudentManagementSystem;

import java.util.Scanner;

public class StudentManagementSystem {
    int count = 0;
    Student[] students = new Student[10];
    final Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        // Check if array is full
        if (count >= students.length) {
            System.out.println("Student list is full. Cannot add more students.");
            return;
        }

        // Input student ID
        System.out.println("Enter the student Id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        // Check for duplicate ID
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        // Input student name
        System.out.println("Enter the Name: ");
        String name = scanner.nextLine();

        // Input student percentage
        System.out.println("Enter the Percentage: ");
        double percentage = scanner.nextDouble();

        // Initialize the student object
        Student obj = new Student(id, name, percentage);

        // Save the student in the array
        students[count] = obj;

        // Increment count
        count++;

        System.out.println("Student added successfully!");
    }

    public void viewStudent() {
        // Flag to check if students exist
        boolean isEmpty = true;

        // Check for non-null values
        for (Student student : students) {
            if (student != null) {
                System.out.println("*********************************");
                System.out.println("Student Id : " + student.getId());
                System.out.println("Student Name : " + student.getName());
                System.out.println("Student % : " + student.getPercentage());
                System.out.println("*********************************");
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("No students found in the system.");
        }
    }

    public void searchById() {
        // Input student Id
        System.out.println("Enter the Student Id : ");
        int id = scanner.nextInt();

        // Flag to track if the student exists
        boolean found = false;

        for (Student student : students) {
            if (student != null && student.getId() == id) {
                System.out.println("*********************************");
                System.out.println("Student Id : " + student.getId());
                System.out.println("Student Name : " + student.getName());
                System.out.println("Student % : " + student.getPercentage());
                System.out.println("*********************************");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Student found by this Id " + id);
        }
    }

    public void update() {
        // Input Student ID
        System.out.println("Enter the Student ID to update: ");
        int id = scanner.nextInt();

        // Flag to check if student exists
        boolean found = false;

        for (Student student : students) {
            if (student != null && student.getId() == id) {
                System.out.println("Enter the new Student ID: ");
                int newId = scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline
                student.setId(newId);

                System.out.println("Enter the new Student Name: ");
                String newName = scanner.nextLine();
                student.setName(newName);

                System.out.println("Enter the new Percentage: ");
                double newPercentage = scanner.nextDouble();
                student.setPercentage(newPercentage);
                scanner.nextLine(); // Consume leftover newline

                System.out.println("Student Updated Successfully!");

                found = true;
                break; // Exit loop after updating
            }
        }

        if (!found) {
            System.out.println("No Student found with ID " + id);
        }
    }

    public void delete() {
        // Input Student Id
        System.out.println("Enter the Student Id :");
        int id = scanner.nextInt();

        // Flag to check if student exists
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i] != null && students[i].getId() == id) {
                // Shift elements left to remove the student
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                // Remove duplicate last entry
                students[count - 1] = null;

                // Decrease student count
                count--;
                found = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("No Student found with Id : " + id);
        }
    }

    public void menu() {
        while (true) {

            System.out.println("1. Add the Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Id");
            System.out.println("4. Update Student Details");
            System.out.println("5. Delete the record");
            System.out.println("6. Exit!");

            System.out.println("Enter the choice number : ");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> addStudent();
                case 2 -> viewStudent();
                case 3 -> searchById();
                case 4 -> update();
                case 5 -> delete();
                case 6 -> {
                    System.out.println("Exiting the student Management system...!");
                    return;
                }
                default -> System.out.println("Invalid Number");
            }

        }
    }

    public static void main(String[] args) {
        StudentManagementSystem managementSystem = new StudentManagementSystem();
        managementSystem.menu();
    }

}
