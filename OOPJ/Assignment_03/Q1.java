package Assignment_03;
public class Q1 {
    // Find the Largest and Smallest Element
    public static void main(String[] args) {
        int[] arr ={5,3,9,1,6};
        int Largest = arr[0];
        int Smallest = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            } else if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
            System.out.println("Largest: " + Largest);
            System.out.println("Smallest: " + Smallest);
        }
    }
}