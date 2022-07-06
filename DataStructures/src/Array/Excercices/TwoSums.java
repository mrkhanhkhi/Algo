package Array.Excercices;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// LeetCode #1
public class TwoSums {
    public static void main(String[] args) {
        int intArray[] = {6, 7, 8, 9, 10};
        twoSums(intArray, 18);
    }

    public static void twoSums(int[] arr, int target) {
        // Naive:
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; i++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[]{arr[i], arr[j]};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No solutin found");

        HashSet<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i ++) {
            int temp = target - arr[i];
            if (map.contains(temp)) {
                System.out.println("Pair with given sum: " + target + " is (" + arr[i] + ", " + temp + ")");
            }
            map.add(arr[i]);
        }
    }
}
