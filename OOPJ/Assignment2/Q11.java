public class Q11 {
    public static void main(String[] args) {
        // To check if a given number is a power of 2 using bitwise operators.
        int num = 16;
        String output = (num & (num - 1)) == 0 ? "Power of 2" : "Not a power of 2";
        System.out.println(num + " is a " + output);
    }
    
}
