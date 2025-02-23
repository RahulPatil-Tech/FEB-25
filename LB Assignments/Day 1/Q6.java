import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a First number:");
        int num1 = scanner.nextInt();
        System.out.println("Input a Second number:");
        int num2 = scanner.nextInt();
        int product1 = num1 + num2;
        int product2 = num1 - num2;
        int product3 = num1 * num2;
        int product4 = num1 / num2;
        int product5 = num1 % num2;
        System.out.println("Sum of two numbers is: " + product1);
        System.out.println("Difference of two numbers is: " + product2);
        System.out.println("Product of two numbers is: " + product3);
        System.out.println("Quotient of two numbers is: " + product4);
        System.out.println("Remainder of two numbers is: " + product5);
        scanner.close();
    }
}
