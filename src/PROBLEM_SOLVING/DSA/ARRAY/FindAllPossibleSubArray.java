package PROBLEM_SOLVING.DSA.ARRAY;

public class FindAllPossibleSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printAllSubarrays(arr);
    }

    public static void printAllSubarrays(int[] arr) {
        //! Loop to pick the start index of the subarray
        for (int i = 0; i < arr.length; i++) {
            //! Loop to pick the end index of the subarray
            for (int j = i; j < arr.length; j++) {
                //! Print the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // Print new line after each subarray
            }
        }
    }

}
