import java.util.Scanner;

public class Q8 {
    //: Takes Three Boolean Inputs and Prints True if at Least Two of Them Are True
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = sc.nextBoolean();
        boolean result = (a && b) || (a && c) || (b && c);
        System.out.println("At least two of the values are true: " + result);
        sc.close();
    }
}
