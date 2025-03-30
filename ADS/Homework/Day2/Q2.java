// Write a program to print the multiplication table of a number n using recursion.
package ADS.Homework.Day2;
import java.io.*;
public class Q2 {
     public static void printMultiplicationTable(int n, int i) {
        if (i > 10) {
            return;
        }
        System.out.println(n + " * " + i + " = " + (n * i));
        printMultiplicationTable(n, i + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().split("=")[1].trim());
        printMultiplicationTable(n, 1);
        br.close();
    }
}
