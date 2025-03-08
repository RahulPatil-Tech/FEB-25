public class Q16 {
    //Determines whether a given number is positive, negative, or zero using only the ternary operator.
    public static void main(String[] args) {
        int num = -5;
        String result = num == 0 ? "Zero" : num > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }    
}
