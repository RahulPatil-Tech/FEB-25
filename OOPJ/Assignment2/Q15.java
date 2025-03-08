public class Q15 {
    // Implement a program to swap odd and even bits of a number using bitwise operators.
    public static void main(String[] args) {
        int num = 23;
        int even = num & 0xAAAAAAAA;
        int odd = num & 0x55555555;
        even >>= 1;
        odd <<= 1;
        int result = even | odd;
        System.out.println("Swapped: " + result);
    }
}
