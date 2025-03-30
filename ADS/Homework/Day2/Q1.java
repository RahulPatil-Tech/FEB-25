package ADS.Homework.Day2;
import java.util.Scanner;

public class Q1 {
    static float recursion(int n) {
        if (n == 1) {
            return 1.0f;
        }
        float term = 1.0f / n;

        if (n % 2 == 0) {
            return recursion(n - 1) - term;
        } else {
            return recursion(n - 1) + term;
        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.16f", recursion(n));
        sc.close();
    }
}
