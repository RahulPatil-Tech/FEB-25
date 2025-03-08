public class Q13 {
    //Implement a Java program to find the absolute value of an integer using bitwise operators.
    public static void main(String[] args) {
        int num = -10;
        int mask = num >> 31; 
        int abs = (num + mask) ^ mask;
        System.out.println(abs);
    }
}
