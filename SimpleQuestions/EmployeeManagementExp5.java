import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    String empNo;
    String empName;
    String department;
    String address;
    double salary;

    public Employee(String empNo, String empName, String department, String address, double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.department = department;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-13s %-18s %-18s %-18s %-10.2f", empNo, empName, department, address, salary);
    }
}

public class EmployeeManagementExp5 {
    private static final String FILE_PATH = "employees.ser";
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        loadEmployees();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search for an Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee(scanner);
                    break;
                case 4:
                    saveEmployees();
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        String empNo = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(empNo, empName, department, address, salary);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    private static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
        System.out.printf("| %-13s | %-18s | %-18s | %-18s | %-8s |%n", "Emp No", "Emp Name", "Department", "Address", "Salary");
        System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");

        for (Employee emp : employees) {
            System.out.printf("| %-13s | %-18s | %-18s | %-18s | %-8.2f |%n",
                    emp.empNo, emp.empName, emp.department, emp.address, emp.salary);
        }

        System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
    }

    private static void searchEmployee(Scanner scanner) {
        System.out.print("Enter the Employee ID to search: ");
        String empNo = scanner.nextLine();
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.empNo.equals(empNo)) {
                System.out.println("Employee found:");
                System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
                System.out.printf("| %-13s | %-18s | %-18s | %-18s | %-8.2f |%n",
                        emp.empNo, emp.empName, emp.department, emp.address, emp.salary);
                System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + empNo + " not found.");
        }
    }

    private static void saveEmployees() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.err.println("Failed to save employees: " + e.getMessage());
        }
    }

    private static void loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            employees = (List<Employee>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No existing employee data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Failed to load employees: " + e.getMessage());
        }
    }
}
