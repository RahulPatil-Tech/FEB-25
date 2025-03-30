package ADS.Homework.Assignment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayOperations {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
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
