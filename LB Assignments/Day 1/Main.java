public class Main {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
    }
    
    // Overloading main method for different parameter types, but this won't be called by the JVM.
    public static void main(int[] args) {
        System.out.println("Overloaded main method with int[] args");
    }
}
