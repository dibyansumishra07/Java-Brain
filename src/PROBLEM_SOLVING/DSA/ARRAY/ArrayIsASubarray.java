package PROBLEM_SOLVING.DSA.ARRAY;

public class ArrayIsASubarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] subarray1 = {3, 4, 5};
        int[] subarray2 = {4, 5, 7};

        System.out.println(isSubArray(array, subarray1));  // Output: true
        System.out.println(isSubArray(array, subarray2));  // Output: false
    }

    /*
    * Time Complexity: O(M*N): Looping over N inside M
    * Space Complexity: O(1)
    * */
    public static boolean isSubArray(int[] parentArray, int[] subArray) {
        // If the sub array is longer than the parentArray, it cannot be a sub array
        if (subArray.length > parentArray.length) {
            return false;
        }

        // Sliding window approach: loop through the main array
        for (int i = 0; i <= parentArray.length - subArray.length; i++) {
            // Check if the current window matches the sub array
            boolean matchFound = true;
            for (int j = 0; j < subArray.length; j++) {
                if (parentArray[i + j] != subArray[j]) {
                    matchFound = false;
                    break;
                }
            }
            // If a match was found, return true
            if (matchFound) {
                return true;
            }
        }

        // If no match is found, return false
        return false;
    }

}
