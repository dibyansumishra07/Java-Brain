package problemsolving.DSA.array;

import java.util.Arrays;
import java.util.List;

//Kadane’s Algorithm (O(n) time and O(1) Space)
public class MaximumSumOfSubstringOfArray {
    /*
    *
    * */
    static int maxSubArraySum(int[] a) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < a.length; i++) {
            maxEndingHere += a[i];
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            maxEndingHere = Math.max(maxEndingHere, 0);
        }
        return maxSoFar;
    }

    private static int maxSubArraySumBrutForce(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        int sum =0;
        int highSum=0;
        for(int i =0;i<=list.size();i++){
            for(int j =i+1;j<=list.size();j++){
                sum = list.subList(i, j).stream().mapToInt(Integer::intValue).sum();
                if(sum>highSum){
                    highSum = sum;
                }
            }
            sum=0;
        }
        return highSum;
    }

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };;
        Integer[] a1 = {5, 4, -1, 7, 8};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
        System.out.println("Maximum contiguous sum is " + maxSubArraySumBrutForce(a1));
    }


}
