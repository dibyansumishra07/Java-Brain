package PROBLEM_SOLVING.DSA.ARRAY;
/*
*
* */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] testCase1 = {4,5,6,7,0,1,2};
        int[] testCase2 = {1};
        findTarget(testCase1, 1);
    }

    /*
    * Find the pivot or main element from where the array is divided or rotated
    * - As the array was initially sorted and later breaks or rotated, we can check the pivot element by checking left
    * and right of each element if both left and right of an element is greater than itself then that is the pivot.
    * */
    private static void findTarget(int[] arr, int target) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {

        }
    }
}
