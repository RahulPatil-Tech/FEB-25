public class Q14 {
    //To count the number of 1s (set bits) in a binary representation of a number using bitwise operations.
    public static void main(String[] args) {
        int n = 29;
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        System.out.println(count);
    }
}
