import java.util.Scanner;

class BasicPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Swap Two Numbers Without a Third Variable
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        System.out.println("Before swapping: " + a + ", " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: " + a + ", " + b);

        // Calculate the Area of a Circle
        System.out.print("\nInput the radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);

        // Check If a Number Is Even or Odd
        System.out.print("\nInput a number: ");
        int num = scanner.nextInt();
        System.out.println("The number " + num + " is " + (num % 2 == 0 ? "Even" : "Odd"));

        // Find the Largest of Three Numbers
        System.out.print("\nInput first number: ");
        int x = scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();
        System.out.print("Input third number: ");
        int z = scanner.nextInt();
        System.out.println("The largest number is " + Math.max(x, Math.max(y, z)));

        // Reverse a Number
        System.out.print("\nInput number: ");
        int number = scanner.nextInt();
        int reverse = 0, temp = number;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("The reverse of " + number + " is " + reverse);

        // Calculate the Average of Three Numbers
        System.out.print("\nInput three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        System.out.println("The average is: " + ((num1 + num2 + num3) / 3));

        // Print the Fibonacci Series
        System.out.println("\nFibonacci series up to 10 numbers:");
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

        // Find the Factorial of a Number
        System.out.print("\nInput a number: ");
        int factNum = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= factNum; i++) factorial *= i;
        System.out.println("Factorial of " + factNum + " is " + factorial);

        // Check Whether a Number Is Prime
        System.out.print("\nInput number: ");
        int primeNum = scanner.nextInt();
        boolean isPrime = primeNum > 1;
        for (int i = 2; i <= Math.sqrt(primeNum); i++) {
            if (primeNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("The number " + primeNum + " is " + (isPrime ? "Prime" : "Not Prime"));

        // Print the First N Natural Numbers
        System.out.print("\nInput a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();

        // Convert Celsius to Fahrenheit
        System.out.print("\nInput temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        // Calculate the Power of a Number
        System.out.print("\nInput base number: ");
        int base = scanner.nextInt();
        System.out.print("Input exponent number: ");
        int exponent = scanner.nextInt();
        System.out.println(base + " raised to the power " + exponent + " is " + Math.pow(base, exponent));

        // Count the Number of Digits in a Number
        System.out.print("\nInput three numbers: ");
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int o = scanner.nextInt();
        System.out.println("The average is: " + ((m + k + o) / 3));

        scanner.close();
    }
}
