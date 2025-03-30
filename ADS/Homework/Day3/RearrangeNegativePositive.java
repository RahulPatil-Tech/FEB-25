package ADS.Homework.Day3;
public class RearrangeNegativePositive {

  public static void rearrange(int[] arr) {
      int j = 0; // Index to track the position for negative numbers
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] < 0) {
              if (i != j) { // Swap only if the current element is not already in its correct position
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
              j++; // Increment j to point to the next position for a negative number
          }
      }
  }

  public static void main(String[] args) {
      int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
      rearrange(arr);
      
      System.out.print("Output: ");
      for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  }
}