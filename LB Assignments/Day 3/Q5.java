public class Q5 {
    //Print the Fibonacci sequence up to the number 21.
    public static void main(String[] args) {
       int n = 21, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        } 
    }
}