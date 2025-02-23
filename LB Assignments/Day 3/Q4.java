public class Q4 {
    //Reverse the digits of the number 1234. The output should be 4321.
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number is: " + reversed);
    }
}
