package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,2,4};
        int[] nums = {3, 4, 6, 9, 2, 6};
        int target = 10;
//        twoSumONSquare(nums, target);
//        twoSumBrutForce(nums, target);
        twoSumONOptimal(nums, target);

    }

    private static int[] twoSumBrutForce(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            int otherIndex = Arrays.stream(nums).boxed().toList().indexOf(diff);

            if (otherIndex != -1) {
//                System.out.println(nums[i]+" "+nums[otherIndex]);
                System.out.println("Index: " + i + " " + otherIndex);
//                return new int[]{i, otherIndex};
            }
        }
        return result;
    }

    public static int[] twoSumOofNSquare(int[] nums, int target) {
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

    /**
     * @implSpec
     * !- Find each element from the array <br>
     * !- Then calculate the difference between the element and target <br>
     * !- Put the current number in the map key and it's index in the value <br></>
     * !- Before putting into the map check if the difference is already present in the array or not.<br>
     * !-> If yes then print it
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumONOptimal(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                System.out.println(i+"-"+map.get(diff));
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
