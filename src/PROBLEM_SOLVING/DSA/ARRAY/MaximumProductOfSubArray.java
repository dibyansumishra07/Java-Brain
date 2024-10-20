package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
* Dynamic Programming
* Cases
* - All Positive Numbers: Just count the product of total array
* - Both Positive and Negative Numbers
*   - Even Count or Two Constitutive negatives:
*       - Which can make a positive number: Just count the product of total array and negative * negative will be positive
*   - Odd Count or One Occurrence of negatives: Which can make a negative number
*       - Exclude the odd negative
*       - If the whole array is full of negative number just calculate the even ones asn we will get the maximum one
* - Have 0 in the array: Find the product of sub array before 0 and after 0 and then compare both and ignore 0
* */
public class MaximumProductOfSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};// 6
        int[] arr1 = {-3,-1,-1};// 3
        int[] arr2 = {0, 2}; // 2
        int[] arr3 = {-2,0,-1};// 0
        int[] arr4 = {2,3,-2,-5,6,-1,4};// 360
        int[] arr5 = {2,-5,-2,-4,3};// 24
//        findMaxProductOfSubArrayBruteForce(arr5);
        findMaxProductOfSubArray(arr5);
    }

    private static void findMaxProductOfSubArray(int[] arr) {
        int size = arr.length;
        int leftSideProduct = 1;
        int rightSideProduct = 1;
        int finalProduct = arr[0];

        for (int i = 0; i < size; i++) {
            // ! Adding check for zero so that our calculation will reset when we will encounter zero
            leftSideProduct = leftSideProduct == 0 ? 1: leftSideProduct;
            rightSideProduct = rightSideProduct == 0 ? 1: rightSideProduct;

            // * Calculating product from left side
            leftSideProduct *= arr[i];
            // * Calculating product from right side
            rightSideProduct *= arr[size-1-i];

            // * Finding the maximum value among left and right side product and last store maximum value
            finalProduct = Math.max(finalProduct, Math.max(leftSideProduct, rightSideProduct));
        }

        System.out.println("Maximum Product is :"+ finalProduct);
    }

    /**
     *
     * @param arr
     */
    private static void findMaxProductOfSubArrayBruteForce(int[] arr) {
        int currentProduct = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            currentProduct *= arr[i];
            set.add(currentProduct);
        }
        System.out.println("Max product: " + Collections.max(set));
    }
}
