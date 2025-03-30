package ADS.Homework.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static String generateGCDFormula(int n) {
        if (n <= 1) {
            return "gcd(int, int)"; // Base case: GCD of two numbers
        }

        StringBuilder formula = new StringBuilder("gcd(int, ");
        formula.append(generateGCDFormula(n - 1));
        formula.append(")");

        return formula.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bufferedReader.readLine().trim();
        String[] parts = inputLine.split("=");
        int n = Integer.parseInt(parts[1].trim());

        String result = generateGCDFormula(n);
        System.out.println(result);

        bufferedReader.close();
    }
}
