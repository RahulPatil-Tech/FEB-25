package Assignment_03;
public class Q6 {
    // Remove Duplicates from a Sorted Array
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5};
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }

        System.out.println("Array without duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
