class Customer {
    int customerId;
    String name;
    double balance;
    public Customer(int customerId, String name, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.balance = balance;
    }
    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

class Bank {
    public static void deposit(Customer customer, double amount) {
        if (amount > 0) {
            customer.balance += amount;
            System.out.println("Deposited " + amount + ". New Balance: " + customer.balance);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }
    public static void withdraw(Customer customer, double amount) {
        if (amount > 0 && amount <= customer.balance) {
            customer.balance -= amount;
            System.out.println("Withdrew " + amount + ". New Balance: " + customer.balance);
        } else if (amount > customer.balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount should be greater than zero.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Alice", 5000);
        Customer customer2 = new Customer(2, "Bob", 3000);
        Bank.deposit(customer1, 1000);  
        Bank.withdraw(customer1, 500);
        Bank.deposit(customer1, 2000);
        Bank.deposit(customer2, 500); 
        Bank.withdraw(customer2, 1000);
        Bank.withdraw(customer2, 1500);
        System.out.println("Customer 1 Details After Operations:");
        customer1.displayInfo();
        System.out.println("Customer 2 Details After Operations:");
        customer2.displayInfo();
    }
}
