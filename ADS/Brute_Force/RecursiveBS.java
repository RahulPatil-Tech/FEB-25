package ADS.Brute_Force;

public class RecursiveBS {
    int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid; // Element found
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x); // Search left half
            return binarySearch(arr, mid + 1, high, x); // Search right half
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        RecursiveBS ob = new RecursiveBS();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, 0, arr.length - 1, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
/*
 * Time Complexity:
 * 
 * Best Case: O(1)
 * Average Case: O(log N)
 * Worst Case: O(log N)
 * 
 * Auxiliary Space:
 * O(1) for iterative
 * O(log N) for recursive (due to recursion stack)
 */