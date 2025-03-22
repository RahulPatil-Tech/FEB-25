package Assignment_03;
public class Q5 {
    // Sum and Average
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        double average = 0.0;
        for (int number : numbers) {
            sum += number;
            }
            average = (double) sum / numbers.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            }
}
