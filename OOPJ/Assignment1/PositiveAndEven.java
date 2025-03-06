public class PositiveAndEven {
    public static void main(String[] args) {
        int num = 12;

        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else {
            System.out.println(num + " is either negative or odd.");
        }
    }
}
