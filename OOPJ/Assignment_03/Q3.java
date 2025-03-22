package Assignment_03;
public class Q3 {
    // Find the Second Largest Element
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num: arr) {
            if(num > largest){
                secondLargest = largest;
                largest = num;
                } else if (num > secondLargest && num != largest){
                    secondLargest = num;
                    }
                }
                System.out.println("Second Largest Element is: " + secondLargest);
            }
        }