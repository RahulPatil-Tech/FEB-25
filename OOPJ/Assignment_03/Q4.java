package Assignment_03;
public class Q4 {
    // Count Even and Odd Numberss
    public static void main(String[] args) {
        int[] arr = {21,22,26,24,29,30,35};
        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
