package PROBLEM_SOLVING.DSA.ARRAY;
/*
*
* */
public class MaximumMinimumInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1};

        int min = arr[0], max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        System.out.println(min+"<"+max);
    }
}
