package ADS.Homework.Day2;

import java.io.*;

public class Q4 {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bufferedReader.readLine().trim();

        String result = reverseString(inputLine);
        System.out.println(result);

        bufferedReader.close();
    }
}
