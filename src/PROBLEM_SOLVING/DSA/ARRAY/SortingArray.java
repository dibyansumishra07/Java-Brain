package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;

/*
 * Bubble Sort
 * Selection Sort
 * Insertion Sort
 * */
public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, -4, -5};

//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
    }

    /*
    *
    *
    * */
    private static void insertionSort(int[] arr) {

    }

    /*
    * Selection Sort
    * Approach
    * - Take small element and add it in the first
    * - 1 Swap per iteration
    * - Compare each value with next value till end and find the smallest one
    * Complexity
    * - Outer Loop running n time always
    * - Time Complexity: O(N^2)
    * */
    private static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length-1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < length; j++) {
                if(arr[smallestIndex] > arr[j]){
                    smallestIndex = j;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    /*
     * Move heavy elements to down and light to up
     * Complexity: Time O(N^2), Space O(1)
     * Remark: Not optimized
     * */
    private static void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
