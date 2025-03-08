public class Q19 {
    //That checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator.
    public static void main(String[] args) {
        char ch = 'A';
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
        System.out.println(result);
    }

    
}
