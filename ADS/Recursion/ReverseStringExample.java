// Source: https://www.geeksforgeeks.org/reverse-a-string-using-recursion/
// Date: 2021-10-10
package ADS.Recursion;
class ReverseString {
    static String reverse(String str){
        if (str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
public class ReverseStringExample {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        System.out.println(ReverseString.reverse(str));
    }
}
