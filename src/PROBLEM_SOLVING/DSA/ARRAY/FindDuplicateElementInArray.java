package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6,4};
        findDuplicateNestedLoops(arr);
    }

    private static void findDuplicateNestedLoops(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    duplicates.add(arr[i]);
                }
            }
        }
        System.out.println("Duplicates are: "+duplicates);
    }
}
