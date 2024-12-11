package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Bruteforce
 * - Buy on each day and sell on each next day and find maximum price
 * -
 * */
public class StockBuyAndSells {
    public static void main(String[] args) {
//        int[] arr = {7, 10, 1, 3, 6, 9, 2};
//        int[] arr = {1, 2}; // 1
        int[] arr = {7, 1, 5, 3, 6, 4};// 5
//        int[] arr = {7,6,4,3,1};// 0

        bestTimeToBuyAndSellBruteForce(arr, arr.length);
        bestTimeToBuyAndSellUsingAuxArray(arr, arr.length);
        bestTimeToBuyAndSellOptimal(arr, arr.length);
//        bestTimeToBuyAndSellFailed(arr);
    }

    /*
    * Keep first element of the array and store as a minimum value and then inside loop keep checking for the lowest value
    *
    *
    * */
    private static void bestTimeToBuyAndSellOptimal(int[] arr, int length) {
        int lowPriceSoFar = arr[0];
        int profitSoFar = 0;
        for (int i = 1; i < length; i++) {
            lowPriceSoFar = Math.min(lowPriceSoFar, arr[i]);
            profitSoFar = Math.max(arr[i]-lowPriceSoFar, profitSoFar);
        }
        System.out.println(profitSoFar);
    }

    /*
     * Time/Space Complexity: O(N)
     * Approach:
     * - Create a auxiliary array with same length to store selling price where we will store the next highest element or price for each day
     *  - Keep a maxSoFar tracker variable and assign the last element of the array
     *  - And start from the right side by comparing each element with the maxSoFar and store the max value in the same index
     * - Now, run another loop and compare the different between auxiliary array element - stock price element and find the maximum difference
     * */
    private static void bestTimeToBuyAndSellUsingAuxArray(int[] arr, int length) {
        int[] auxArr = new int[length];
        int maxSoFar = arr[length-1];
        int profitSoFar = Integer.MIN_VALUE;

        for (int i = length-1; i >= 0; i--) {
            maxSoFar = Math.max(arr[i], maxSoFar);
            auxArr[i] = Math.max(arr[i], maxSoFar);
        }
        for (int i = 0; i < length; i++) {
            profitSoFar = Math.max(auxArr[i]-arr[i], profitSoFar);
        }
        System.out.println(profitSoFar);
    }

    /*
    * Approach
    * - Buying each day and selling in each future dau.
    * - Use a loop to select each element of an array for buying
    * - Use another loop inside outer loop to select all future day to sell
    * - Use a variable to store the maximum profit by subtracting from all future day price - current price
    * Complexity
    * - Time O(N2) and Space is O(N)
    * */
    private static void bestTimeToBuyAndSellBruteForce(int[] arr, int length) {
        int maxProfit = 0;

        // Outer Loop to buy the stock
        for (int i = 0; i < length; i++) {
            // Inner Loop to sell the stock
            for (int j = i + 1; j < length; j++) {
                maxProfit = Math.max(maxProfit, arr[j] - arr[i]);
            }
        }

        System.out.println(maxProfit);
    }

    public static int bestTimeToBuyAndSellFailed(int[] prices) {
        List<Integer> list = Arrays.stream(prices).boxed().toList();

        int[] finalResult = new int[2];
        int minValue = Collections.min(list);
        int maxValue = Collections.max(list.subList(list.indexOf(minValue), prices.length));
        if (maxValue > minValue)
            return list.indexOf(maxValue) + 1;
        else
            return 0;
    }

}
