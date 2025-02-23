import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input First Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input Second Number: ");
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + product);
        scanner.close();
        
    }
}
