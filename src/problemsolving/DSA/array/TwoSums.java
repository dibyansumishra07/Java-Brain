package problemsolving.DSA.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,4};
        int target = 5;
        int[] resultUsingOptimal = twoSumOptimal(nums, target);
        int[] resultUsingBrutForce = twoSumBrutForce(nums, target);
        System.out.println("[" + resultUsingOptimal[0] + ", " + resultUsingOptimal[1] + "]");
        System.out.println("[" + resultUsingBrutForce[0] + ", " + resultUsingBrutForce[1] + "]");
    }

    private static int[] twoSumBrutForce(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            int otherIndex = Arrays.asList(nums).indexOf(diff);
            if(otherIndex != -1){
                return new int[]{i, otherIndex};
            }
        }
        return result;
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
