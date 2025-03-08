public class Q20 {
    // Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).
    public static void main(String[] args) {
        int num = -50002;
        int abs = (num < 0) ? -num : num;
        System.out.println("The absolute value of " + num + " is " + abs);
    }
}
