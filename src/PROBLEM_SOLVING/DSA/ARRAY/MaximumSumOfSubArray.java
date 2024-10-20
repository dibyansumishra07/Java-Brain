package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;
import java.util.List;

//Kadane’s Algorithm (O(n) time and O(1) Space)
public class MaximumSumOfSubArray {
    /*
     *
     * */
    static int maxSubArraySum(int[] a) {
        int finalMax = a[0];
        int currentMax = 0;
        for (int i = 0; i < a.length; i++) {
            currentMax = currentMax + a[i];
            finalMax = Math.max(finalMax, currentMax);
            currentMax = Math.max(currentMax, 0);
        }
        return finalMax;
    }

    private static int maxSubArraySumBrutForce(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        int sum = 0;
        int highSum = 0;
        for (int i = 0; i <= list.size(); i++) {
            for (int j = i + 1; j <= list.size(); j++) {
                sum = list.subList(i, j).stream().mapToInt(Integer::intValue).sum();
                if (sum > highSum) {
                    highSum = sum;
                }
            }
            sum = 0;
        }
        return highSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        Integer[] ARR = {-2, -3, 4, -1, -2, 1, 5, -3};
        Integer[] a1 = {5, 4, -1, 7, 8};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
        System.out.println("Maximum contiguous sum is " + maxSubArraySumBrutForce(ARR));
    }

}
