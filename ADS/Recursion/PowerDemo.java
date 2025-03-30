package ADS.Recursion;
class Power {
    public double power(int x, int y) {
        if (y == 0) return 1; // Base case
        double half = power(x, y / 2);
        return (y % 2 == 0) ? half * half : x * half * half;
    }
}
public class PowerDemo {
    public static void main(String[] args) {
        Power p = new Power(); // Create an instance
        System.out.println(p.power(2, 5)); // Call power method
    }
}
