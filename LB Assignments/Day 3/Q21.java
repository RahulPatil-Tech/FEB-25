public class Q21 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            int odd = 1; // Start with the first odd number
            for (int j = 1; j <= i; j++) {
                System.out.print(odd);
                if (j < i) {
                    System.out.print("*");
                }
                odd += 2; // Move to the next odd number
            }
            System.out.println();
        }
    }
}
