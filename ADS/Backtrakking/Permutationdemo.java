package ADS.Backtrakking;
class Permutationdemo {
    static void display(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            display(ros, ans + ch);
        }
    }
    // Time Complexity O(n!)
    public static void main(String[] args) {
        String s = "ABC";
        display(s, "");
    }
    
}