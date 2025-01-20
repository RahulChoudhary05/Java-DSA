class Employee {
    String empNo;
    String empName;
    String department;
    String address;
    double salary;

    Employee(String empNo, String empName, String department, String address, double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.department = department;
        this.address = address;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    private static Employee[] employees = new Employee[100];
    private static int count = 0;

    public static void main(String[] args) {
        addEmployee("22BCS10040", "Rahul Choudhary", "HR", "123 Main St", 600000);
        addEmployee("22BCS10041", "Mayank", "IT", "456 Oak St", 75000);
        addEmployee("22BCS10042", "Ravi", "Finance", "789 Pine St", 70000);
        
        displayEmployees();

        searchEmployee("22BCS10040");
        searchEmployee("22BCS10050");
    }

    public static void addEmployee(String empNo, String empName, String department, String address, double salary) {
        if (count < employees.length) {
            employees[count++] = new Employee(empNo, empName, department, address, salary);
        } else {
            System.out.println("Cannot add more employees. Array is full.");
        }
    }

    public static void displayEmployees() {
        System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
        System.out.printf("| %-13s | %-18s | %-18s | %-18s | %-8s |%n", "Emp No", "Emp Name", "Department", "Address", "Salary");
        System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
        
        for (int i = 0; i < count; i++) {
            Employee emp = employees[i];
            System.out.printf("| %-13s | %-18s | %-18s | %-18s | %-8.2f |%n", emp.empNo, emp.empName, emp.department, emp.address, emp.salary);
        }

        System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
    }

    public static void searchEmployee(String empNo) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp != null && emp.empNo.equals(empNo)) {
                found = true;
                System.out.println("Searching for employee with ID " + empNo);
                System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
                System.out.printf("| %-13s | %-18s | %-18s | %-18s | %-8.2f |%n", 
                                  emp.empNo, emp.empName, emp.department, emp.address, emp.salary);
                System.out.println("+---------------+--------------------+--------------------+--------------------+----------+");
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + empNo + " not found.");
        }
    }
}
