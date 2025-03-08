public class Q10 {
    //To determine if a character is a vowel or a consonant using the ternary operator.
    public static void main(String[] args) {
        char ch = 'a';
        String output = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) ? "Vowel" : "Consonant";
        System.out.println(ch + " is a " + output);
    }
}
