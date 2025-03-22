package Assignment_04;

import java.util.Scanner;

class Electricity_bill{
    String name;
    double units;
    double bill;
    Electricity_bill(String name, double units){
        this.name = name;
        this.units = units;
    }
    void calculate(){
        if(units <= 100){
            bill = units * 5;
        }else if(units <= 300){
            bill = 100 * 5 + (units - 100) * 7;
        }else{
            bill = 100 * 5 + 200 * 7 + (units - 300) * 10;
        }
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill Amount: " + bill);
    }
}
public class Electricitydemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        double unitsConsumed = scanner.nextDouble();

        // Create an object of the ElectricityBill class
        Electricity_bill customer = new Electricity_bill(customerName, unitsConsumed);

        // Call the method to calculate the bill amount
        customer.calculate();

        // Display the bill details
        customer.display();

        // Close the scanner
        scanner.close();
    }
}