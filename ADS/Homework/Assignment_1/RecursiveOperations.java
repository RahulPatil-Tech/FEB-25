package ADS.Homework.Assignment_1;

public class RecursiveOperations {

    public static boolean isPrime(int num, int i) {
        if (num <= 2) return (num == 2);
        if (num % i == 0) return false;
        if (i * i > num) return true;
        return isPrime(num, i + 1);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) return 0;
        return num % 10 + sumOfDigits(num / 10);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int num = 7;
        String str = "racecar";
        int sumNum = 1234;
        int fibIndex = 6;
        int a = 2, b = 5;

        System.out.println("Is prime: " + isPrime(num, 2));
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str, 0, str.length() - 1));
        System.out.println("Sum of digits of " + sumNum + ": " + sumOfDigits(sumNum));
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}