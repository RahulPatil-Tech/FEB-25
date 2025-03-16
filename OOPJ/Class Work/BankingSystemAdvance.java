import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private String transactionHistory;
    public BankAccount(String accountHolder, int accountNumber) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = "";
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory += "Deposited: $" + amount + "\n";
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            transactionHistory += "Withdrew: $" + amount + "\n";
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Account balance: $" + balance);
    }

    public void viewTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            System.out.println("Transaction History: ");
            System.out.println(transactionHistory);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

}

public class BankingSystemAdvance {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount account = null;

    public static void displayMenu() {
        System.out.println("\n---- Banking System ----");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. View Transaction History");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (account != null) {
                        System.out.println("Account already exists!");
                        break;
                    }

                    System.out.print("Enter Account Holder Name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    account = new BankAccount(accountHolder, accountNumber);
                    System.out.println("Account created successfully for " + accountHolder);
                    break;

                case 2:
                    if (account == null) {
                        System.out.println("No account found! Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    if (account == null) {
                        System.out.println("No account found! Please create an account first.");
                        break;
                    }
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    if (account == null) {
                        System.out.println("No account found! Please create an account first.");
                        break;
                    }
                    account.checkBalance();
                    break;

                case 5:
                    if (account == null) {
                        System.out.println("No account found! Please create an account first.");
                        break;
                    }
                    account.viewTransactionHistory();
                    break;

                case 6:
                    System.out.println("Thank you for using the Banking System!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
