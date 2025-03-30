package ADS.Homework.Assignment_1;

public class SortedArrayOperations {

    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int findFirstOccurrence(int[] arr, int key) {
        int index = binarySearch(arr, key);
        if (index == -1) return -1;
        while (index > 0 && arr[index - 1] == key) {
            index--;
        }
        return index;
    }

    public static int findLastOccurrence(int[] arr, int key) {
        int index = binarySearch(arr, key);
        if (index == -1) return -1;
        while (index < arr.length - 1 && arr[index + 1] == key) {
            index++;
        }
        return index;
    }

    public static int countOccurrences(int[] arr, int key) {
        int first = findFirstOccurrence(arr, key);
        if (first == -1) return 0;
        return findLastOccurrence(arr, key) - first + 1;
    }

    public static int findPeakElement(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[0] > arr[1] ? arr[0] : arr[arr.length - 1]; // Handle edge cases
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 6, 8};
        int key = 3;
        int[] peakArr = {1, 2, 18, 4, 5, 0};

        System.out.println("Key found at index: " + binarySearch(arr, key));
        System.out.println("First occurrence: " + findFirstOccurrence(arr, key));
        System.out.println("Last occurrence: " + findLastOccurrence(arr, key));
        System.out.println("Total count of key: " + countOccurrences(arr, key));
        System.out.println("Peak element: " + findPeakElement(peakArr));
    }
}