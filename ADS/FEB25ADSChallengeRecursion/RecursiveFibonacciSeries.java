package ADS.FEB25ADSChallengeRecursion;
/*
Write a recursive function to generate the Fibonacci series up to a given number n. The Fibonacci series is defined as follows:

The first two numbers of the series are 0 and 1. Each subsequent number is the sum of the two preceding numbers. Write a function fibonacci(n) that takes an integer n as input and returns the Fibonacci series up to n as a list.

Input Format

n = 10

Constraints

1 ≤ n ≤ 50

Output Format

[0, 1, 1, 2, 3, 5, 8]

Sample Input 0

n = 5
Sample Output 0

[0, 1, 1, 2, 3]
Sample Input 1

n = 20
Sample Output 1

[0, 1, 1, 2, 3, 5, 8, 13]
Sample Input 2

n = 1
Sample Output 2

[0, 1] */
import java.util.*;

public class RecursiveFibonacciSeries {
    static List<Integer> fibonacci(int n) {
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            return result;
        } else if (n == 1) {
            result.add(0);
            return result;
        } else if (n == 2) {
            result.add(0);
            result.add(1);
            return result;
        } else {
            result = fibonacci(n - 1);
            result.add(result.get(result.size() - 1) + result.get(result.size() - 2));
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> result = fibonacci(n);
        System.out.println(result);
}
}
// FAILED TEST CASE