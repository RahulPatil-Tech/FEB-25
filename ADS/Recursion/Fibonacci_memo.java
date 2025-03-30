package ADS.Recursion;
import java.util.HashMap;

class Fibonacci_memo{
    static HashMap<Integer, Long> memo = new HashMap<>();
    public static long fib(int n){
        if(n<=1) return n; // base case
        if(memo.containsKey(n)) return memo.get(n);
        long result = fib(n-1) + fib(n-2);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args){
        System.out.println(fib(3));
    }
}
