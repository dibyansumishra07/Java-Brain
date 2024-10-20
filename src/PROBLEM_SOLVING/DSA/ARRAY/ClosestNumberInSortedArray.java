package PROBLEM_SOLVING.DSA.ARRAY;

public class ClosestNumberInSortedArray {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 2, 5, 8, 12};
        int target = 0;
        int closest = findClosest(arr, target);
        System.out.println("Closest number to " + target + " is: " + closest);
    }

    private static int findClosest(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (Math.abs(arr[left] - target) <= Math.abs(arr[right] - target)) {
                right--;
            }
            else {
                left++;
            }
        }
        return arr[left];
    }

}
