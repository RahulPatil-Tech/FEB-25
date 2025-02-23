public class Q7 {
    /* Calculate the sum of the digits of the number 9876. The output should be
30 (9 + 8 + 7 + 6)*/
    public static void main(String[] args) {
        int num = 9876;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;            
        }
        System.out.println("Sum of the digits of 9876 is: " + sum);
        }
    }
