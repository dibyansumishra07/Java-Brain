package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.HashMap;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr = {3,7,5,8,2,8,2};
        int target = 10;
//        sumofIndexes(arr, target);
//        sumofIndexesUsingHashMap(arr, target);
        alternateMergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6, 7, 8, 9});
    }

    private static void sumofIndexes(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int a = arr[i];
            for (int j = 1; j < arr.length-1; j++) {
                int b = arr[j];
                if(a+b == 10){
                    System.out.println("Indexes are: "+ i +" "+ j);
                }
            }
            System.out.println();
        }
    }
    //Time Complexity O(n)
    private static void sumofIndexesUsingHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int remaining = target - arr[i];
            if(map.containsKey(remaining)){
                System.out.println("index i: " +i+ "index j: " + map.get(remaining));
            }
            map.put(arr[i],i);
        }
    }

    private static int[] alternateMergeArrays(int[] array1, int[] array2){
        int[] alternateMergeArray = new int[array1.length+ array2.length];
        int k = 0;
        for (int i = 0; i < Math.max(array1.length, array2.length); i++) {
            if(i<array1.length){
                alternateMergeArray[k] = array1[i];
            } else {
                k--;
            }
            if(i<array2.length){
                alternateMergeArray[k+1] = array2[i];
                k++;
            }
            k++;
        }
        for(int i: alternateMergeArray){
            System.out.print(i+"-");
        }
        return  alternateMergeArray;
    }

}
