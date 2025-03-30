package ADS.Homework.Day3;
import java.util.ArrayList;
import java.util.Arrays;

class Homework1 {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr); // Sort the array

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) { // Check for adjacent duplicates
                if (!result.contains(arr[i])) { // Avoid adding duplicates multiple times
                    result.add(arr[i]);
                }
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 3, 1, 2};
        int n1 = arr1.length;
        System.out.println(duplicates(arr1, n1)); // Output: [-1]

        int[] arr2 = {2, 3, 1, 2, 3};
        int n2 = arr2.length;
        System.out.println(duplicates(arr2, n2)); // Output: [2, 3]
    }
}