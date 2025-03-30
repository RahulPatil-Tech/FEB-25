package ADS.Homework.Day3;

public class SearchElement {

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};

        int x1 = 110;
        int result1 = search(arr, x1);
        System.out.println("Element " + x1 + " is present at index " + result1); // Output: 6

        int x2 = 175;
        int result2 = search(arr, x2);
        System.out.println("Element " + x2 + " is present at index " + result2); // Output: -1
    }
}