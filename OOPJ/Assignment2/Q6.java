public class Q6 {
    public static void main(String[] args) {
        int a = 10 ; int b = 20; int c = 30;
        // ternary operator TO FIND THE LARGEST NUMBER
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);
    }
    
}
