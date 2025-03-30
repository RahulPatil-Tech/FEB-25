package ADS.Brute_Force;

public class IterativeBS {
    int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid; // Element found
            if (arr[mid] < x)
                low = mid + 1; // Search right half
            else
                high = mid - 1; // Search left half
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        IterativeBS ob = new IterativeBS();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
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
 * 
 * Average Case: O(log N)
 * 
 * Worst Case: O(log N)
 * 
 * Auxiliary Space: O(1)
 * 
 */