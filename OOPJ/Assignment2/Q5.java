public class Q5 {
    public static void main(String[] args) {
        // Swap Two number += and -=
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
    
}
