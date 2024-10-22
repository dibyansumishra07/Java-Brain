package PROBLEM_SOLVING.DSA.ARRAY;

public class SecondHighestElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 0, 4, 0, 5, 0, 4, 0, 2, 0, 1, -2, -3, 0, 4, 5, 0};

        int maxNumber = nums[0];
        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            secondMax = maxNumber;
            maxNumber = Math.max(maxNumber, nums[i]);
        }

    }
}
