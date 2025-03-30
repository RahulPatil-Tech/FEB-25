package ADS.Linear_Seach;

public class Lineardemo {
    public static int linearSearch(int arr[], int key) {
        // Traverse the array
        // Check if the current element is equal to the key
        // If found, return the index
        // If not found, return -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // Time Complexity O(n)
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 3;
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
        
    }
}
