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
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, String position, double salary) {
        super(employeeId, name, position, salary);
    }
    public void giveRaise(double raiseAmount) {
        if (raiseAmount > 0) {
            this.salary += raiseAmount;
            System.out.println("Full-time employee " + name + " received a raise of " + raiseAmount + ". New Salary: " + salary);
        } else {
            System.out.println("Raise amount should be greater than zero.");
        }
    }
}
class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int employeeId, String name, String position, double hourlyRate) {
        super(employeeId, name, position, hourlyRate * 20);
    }
    public void giveRaise(double raiseAmount) {
        if (raiseAmount > 0) {
            this.salary += raiseAmount * 20; 
            System.out.println("Part-time employee " + name + " received a raise of " + (raiseAmount * 20) + ". New Salary: " + salary);
        } else {
            System.out.println("Raise amount should be greater than zero.");
        }
    }
}
class EmployeeManager {
    public static void displayEmployeeInfo(Employee employee) {
        employee.displayInfo();
    }
    public static void updatePosition(Employee employee, String newPosition) {
        employee.position = newPosition;
        System.out.println(employee.name + "'s position updated to: " + newPosition);
    }
}
public class InheritEmploeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee employee1 = new FullTimeEmployee(1, "Alice", "Software Engineer", 60000);
        PartTimeEmployee employee2 = new PartTimeEmployee(2, "Bob", "HR Assistant", 20);
        employee1.giveRaise(5000);
        EmployeeManager.updatePosition(employee1, "Senior Software Engineer");

        employee2.giveRaise(3);
        EmployeeManager.updatePosition(employee2, "Head of HR Assistant");
        
        System.out.println("Employee 1 Details After Operations:");
        EmployeeManager.displayEmployeeInfo(employee1);

        System.out.println("Employee 2 Details After Operations:");
        EmployeeManager.displayEmployeeInfo(employee2);
    }
}


