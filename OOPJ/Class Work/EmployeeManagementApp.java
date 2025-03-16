class Employee {
    int employeeId;
    String name;
    String position;
    double salary;
    
    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------------");
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class EmployeeManager {
    public static void giveRaise(Employee employee, double raiseAmount) {
        if (raiseAmount > 0) {
            employee.setSalary(employee.getSalary() + raiseAmount);
            System.out.println("Salary raised by " + raiseAmount + ". New Salary: " + employee.getSalary());
        } else {
            System.out.println("Raise amount should be greater than zero.");
        }
    }
    public static void updatePosition(Employee employee, String newPosition) {
        employee.position = newPosition;
        System.out.println("Position updated to: " + newPosition);
    }
    public static void displayEmployeeInfo(Employee employee) {
        employee.displayInfo();
    }
}
public class EmployeeManagementApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Alice", "Software Engineer", 60000);
        Employee employee2 = new Employee(2, "Bob", "HR Manager", 50000);
        EmployeeManager.giveRaise(employee1, 5000);
        EmployeeManager.updatePosition(employee1, "Senior Software Engineer");
        EmployeeManager.giveRaise(employee2, 3000);
        EmployeeManager.updatePosition(employee2, "Head of HR");
        System.out.println("Employee 1 Details After Operations:");
        EmployeeManager.displayEmployeeInfo(employee1);
        System.out.println("Employee 2 Details After Operations:");
        EmployeeManager.displayEmployeeInfo(employee2);
    }
}


