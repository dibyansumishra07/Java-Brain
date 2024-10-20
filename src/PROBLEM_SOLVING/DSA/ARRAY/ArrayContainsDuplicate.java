package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        boolean containsDuplicate = containsDuplicate(arr);
        System.out.println("Array contains duplicate: " + containsDuplicate);
        System.out.println("hasDuplicateNestedLoop: " + hasDuplicateNestedLoop(arr));
        System.out.println("hasDuplicateBySortingArray: " + hasDuplicateBySortingArray(arr));
        System.out.println("hasDuplicateByUsingHashSet: " + hasDuplicateByUsingHashSet(arr));

    }

    /*
    * Time Complexity: O(n)
    * */
    private static boolean hasDuplicateByUsingHashSet(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return set.size() != arr.length;
    }

    /*
     * Time Complexity: O(n log n)
     * Space Complexity: O(1) or O(n)
     *
     * Better for space complexity
     * */
    private static boolean hasDuplicateBySortingArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /*
     * Time complexity: O(n2) as using two loops
     * Space Complexity: O(1)
     * */
    static boolean hasDuplicateNestedLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean containsDuplicate(int[] arr) {
        List<Integer> rawList = Arrays.stream(arr).boxed().distinct().toList();
        return rawList.size() != arr.length;
    }
}
