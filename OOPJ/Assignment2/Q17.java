public class Q17 {
    //Implement a Java program that finds the minimum of four numbers using nested ternary operators.
    public static void main(String[] args) {
        int a = 5, b = 3, c = 7, d = 1;
        int min = a < b ? (a < c ? (a < d ? a : d) : (c < d ? c : d)) : (b < c ? (b < d ? b : d) : (c < d ? c : d));
        System.out.println("Minimum: " + min);
    }
}
