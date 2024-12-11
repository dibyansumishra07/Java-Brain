package PROBLEM_SOLVING.DSA.ARRAY;

/* *
 * The MinimumFuelCost class provides a solution to calculate the minimum total cost
 * required to meet the fuel requirements over a series of days based on varying fuel prices.
 *
 * <p>
 * Problem Statement:
 * You have a series of fuel costs for different days, and you need to calculate the minimum total
 * cost to meet the fuel requirements for each day. The constraints are as follows:
 * </p>
 *
 * <h2>Inputs:</h2>
 * <ul>
 *     <li><b>N</b>: An integer representing the number of days (or trips).</li>
 *     <li><b>A</b>: An array of integers where each element A[i] represents the fuel cost per unit on day i.</li>
 *     <li><b>B</b>: An array of integers where each element B[i] represents the fuel requirement (in units) on day i.</li>
 * </ul>
 *
 * <h2>Rules:</h2>
 * <ul>
 *     <li>You can buy fuel on any day at the cost specified in array A.</li>
 *     <li>You can choose to buy fuel at the cheapest price available up to that day for the fuel required on that day.</li>
 * </ul>
 *
 * <h2>Objective:</h2>
 * Calculate the minimum total cost required to fulfill the fuel requirements for all N days
 * by purchasing fuel at the most economical prices available from previous days.
 *
 * <h2>Example Input:</h2>
 * <pre>
 * Fuel costs per day (A): [5, 2, 4, 1]
 * Fuel requirements per day (B): [4, 8, 3, 5]
 * </pre>
 *
 * <h2>Expected Output:</h2>
 * The output should be the minimum total cost for purchasing the required fuel over the specified days.
 *
 * <h2>Explanation of the Code:</h2>
 * <h3>Initialization:</h3>
 * <ul>
 *     <li><b>totalCost</b>: This variable keeps track of the total cost incurred for purchasing the fuel.</li>
 *     <li><b>currentFuelCost</b>: Initialized to the maximum integer value, this variable stores the minimum fuel cost observed up to the current day.</li>
 * </ul>
 *
 * <h3>Logic:</h3>
 * <ul>
 *     <li>Loop through each day from 0 to N-1.</li>
 *     <li>If the fuel cost for the current day (A[i]) is less than the currentFuelCost, update the currentFuelCost.</li>
 *     <li>Calculate the cost for the fuel requirement on that day (B[i]) using the currentFuelCost and add it to totalCost.</li>
 * </ul>
 *
 * <h3>Output:</h3>
 * Finally, the total minimum cost is printed.
 */
public class MinimumFuelCost {
    public static int solve(int N, int[] A, int[] B) {
        int totalCost = 0;
        int currentFuelCost = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] < currentFuelCost) {
                currentFuelCost = A[i];
            }
            totalCost += B[i] * currentFuelCost;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] A = {5, 2, 4, 1};  // Example fuel costs per day
        int[] B = {4, 8, 3, 5};  // Example fuel requirements per day
        int N = A.length;        // Size of arrays

        int result = solve(N, A, B);
        System.out.println("Minimum Total Cost: " + result);
    }
}

