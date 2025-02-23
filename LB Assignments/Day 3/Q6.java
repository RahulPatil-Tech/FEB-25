public class Q6 {
    //Find and print the first 5 prime numbers.
    public static void main(String[] args) {
        int count = 0;
        int num2 = 2;
        while (count < 5) {
            boolean isPrime = true;
            for (int i = 2; i <= num2 / 2; i++) {
                if (num2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num2);
                count++;
            }
            num2++;          
        }
    }
}