public class Q4 {
    // Check Divisibility by 3 Using Subtraction and Bitwise Shifts
    public static void main(String[] args) {
        int n = 12;
        boolean isDivisible = isDivisibleBy3(n);
        if (isDivisible) {
            System.out.println(n + " is divisible by 3");
        } else {
            System.out.println(n + " is not divisible by 3");
        }
    }
    public static boolean isDivisibleBy3(int n) {
        n = Math.abs(n);
        while (n >= 3) {
            n = n - 3;
        }
        return n == 0;
    }
}