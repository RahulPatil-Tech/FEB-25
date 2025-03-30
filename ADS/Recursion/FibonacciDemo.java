package ADS.Recursion;
class Fibonacci{
    static int fact(int n){
        if (n<=1) // base case
            return 1;
        else
            return n*(n-1); // recursive call
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}