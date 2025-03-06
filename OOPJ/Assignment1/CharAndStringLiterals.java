public class CharAndStringLiterals {
    public static void main(String[] args) {
        char charVal = 'A';
        String strVal = "Hello";

        System.out.println("Character: " + charVal + ", ASCII Value: " + (int) charVal);
        System.out.println("String: " + strVal + ", ASCII Values: ");
        for (int i = 0; i < strVal.length(); i++) {
            System.out.println(strVal.charAt(i) + ": " + (int) strVal.charAt(i));
        }
    }
}
