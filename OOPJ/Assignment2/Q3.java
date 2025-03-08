public class Q3 {
    public static void main(String[] args) {
        // loop Extact digits and calculate sum
        int n = 12345;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}