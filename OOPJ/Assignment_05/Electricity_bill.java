package Assignment_05;

import java.util.Scanner;
import java.util.InputMismatchException;

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    // Parameterized constructor
    public ElectricityBill(String customerName, double unitsConsumed) {
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Method to calculate the electricity bill
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    // Method to display the bill information
    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the customer's name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter the units consumed: ");
            double unitsConsumed = scanner.nextDouble();

            ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);
            bill.calculateBillAmount();
            bill.displayBill();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number for units consumed.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
