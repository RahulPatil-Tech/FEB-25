package Assignment_03;
public class Q9 {
    // Missing Number in an Array
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5};
        int n = arr.length + 1 ;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int num : arr){
            arrSum += num;
            }
            System.out.println("Missing No," + (sum - arrSum));
        }    
}
