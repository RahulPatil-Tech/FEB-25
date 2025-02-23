public class Q9 {
    /* Program to find and print the largest digit in the number 4825.*/
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }
        System.out.println(largestDigit);
    }
}
