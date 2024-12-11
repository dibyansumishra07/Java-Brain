package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;

/*
 * TODO: Find better appraoch
 * */
public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, -2, 5, 0, 0, 5};
        moveZerosToEndUsingString(arr);
        moveZerosToEndUsingTempArray(arr);

        pushZerosToEnd(arr);
    }

    private static void moveZerosToEndUsingTempArray(int[] arr) {
        int length = arr.length;
        int[] tempArr = new int[length];

        int iTemp = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                tempArr[iTemp++] = arr[i];
            }
        }

        while (iTemp < length) {
            tempArr[iTemp++] = 0;
        }

        Arrays.stream(tempArr).forEach(System.out::print);
    }

    private static void moveZerosToEndUsingString(int[] arr) {
        int length = arr.length;
        int howManyTimesZeroPresent = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                sb.append(arr[i]);
            } else {
                howManyTimesZeroPresent++;
            }
        }
        sb.append("0".repeat(howManyTimesZeroPresent));
        System.out.println(sb);
    }

    /*
    * Loop over the array and check all non-zero elements and replace them with current index
    * Make a count of index, how many index are now full
    * Run another while loop
    * */
    static void pushZerosToEnd(int[] arr) {

        // Count of non-zero elements
        int count = 0;

        // If the element is non-zero, replace the element at
        // index 'count' with this element and increment count
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

        // Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
        while (count < arr.length)
            arr[count++] = 0;
    }
}
