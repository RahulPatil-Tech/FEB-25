public class Q21 {
    //Program that increments a number without using + or ++ operators.
    public static void main(String[] args) {
        int num = 654;
        int result = -~num;
        System.out.println(num + " + 1 = " + result);
    }
    
}
