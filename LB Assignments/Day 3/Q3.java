public class Q3 {
    //Print all multiples of 7 between 1 and 100.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
