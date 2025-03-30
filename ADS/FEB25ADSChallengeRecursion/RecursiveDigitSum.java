package ADS.FEB25ADSChallengeRecursion;
import java.io.*;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        long sum = 0;
        for (char digit : n.toCharArray()) {
             sum += Character.getNumericValue(digit);
    }

    sum *= k;

    return findSuperDigit(sum);
}

private static int findSuperDigit(long num) {
    if (num < 10) {
        return (int) num; 
    }

    long newSum = 0;
    while (num > 0) {
        newSum += num % 10; 
        num /= 10;          
    }

    return findSuperDigit(newSum);
    }
}

public class RecursiveDigitSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
