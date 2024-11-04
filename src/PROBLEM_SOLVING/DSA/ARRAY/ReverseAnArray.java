package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5,4};

        reverseUsingTempVariable(arr);
    }

    private static void reverseUsingTempVariable(int[] arr) {
        int left = 0, right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
