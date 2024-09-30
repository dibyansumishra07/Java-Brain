package problemsolving.DSA.array;

import java.util.Arrays;
import java.util.List;

public class ArrayContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        boolean containsDuplicate = containsDuplicate(arr);
        System.out.println("Array contains duplicate: " + containsDuplicate);
    }

    private static boolean containsDuplicate(int[] arr) {
        List<Integer> rawList = Arrays.stream(arr).boxed().distinct().toList();
        return rawList.size() != arr.length;


    }
}
