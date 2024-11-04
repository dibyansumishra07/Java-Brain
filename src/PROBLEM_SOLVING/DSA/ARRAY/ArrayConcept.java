package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.Arrays;

/*
 * Datastructures: Array
 * Stores elements same type and maintain insertion order
 * - Common Complexity
 * - Find any element with index: O(1)
 *
 * */
public class ArrayConcept {
    public static void main(String[] args) {
        // Declaration of 1D array
        int[] arr = new int[5];  // Declaration of an integer array of size 5
        String[] stringArr = new String[5];  // Declaration of an integer array of size 5
        int[] arr2 = {1, 2, 3, 4, 5};  // Declaration and initialization


        /*
         * Inserting elements into array
         * - We can use loop to insert elements into array
         * - We can use index and manually to insert elements into array
         * - If we are not inserting any value then it will take default value for primitive
         * - If we are not inserting any value then it will take null for object
         * */
        arr[0] = 10;  // Insert 10 at index 0
        arr[1] = 20;  // Insert 20 at index 1
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        Arrays.stream(stringArr).forEach(i -> System.out.println(i));

        /*
         * Read or Print an array
         * - We can use traditional loop or enhanced for loop to read or direct index
         * - In latest java versions we can convert it into stream and use foreach
         * */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println(arr[1]);

        /*
         * Update an element in array
         * - We can use index to update an element
         * */
        arr[1] = 30;  // Update 20 at index 1 with 30
        System.out.println(arr[1]);

        /*
         * Delete an element from array
         * - We can use index to delete an element
         * - We need to shift all elements to the left to fill the gap
         * - We can use Arrays.copyOf() method to create a new array and copy all elements except the deleted one
         * */
        int index = 1;  // Element to be deleted
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];  // Shift elements left
        }


        arr = Arrays.copyOf(arr, arr.length - 1);  // Delete 20 at index 1
        System.out.println(Arrays.toString(arr));

        reverseArray(arr);
        findMax(arr);
        findMin(arr);
        leftRotateByOne(arr);
        System.out.println(hasPairWithSum(arr, 60));
        /*
         * Sorting an array
         * - Arrays.sort() method sorts the array in ascending order
         * - Arrays.sort(arr, Collections.reverseOrder()); sorts the array in descending order
         * - Arrays.sort(arr, Comparator.comparingInt(Integer::intValue)); sorts the array based on the integer value
         */


    }

    private static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array");
        Arrays.stream(arr).forEach(i -> System.out.print(i + "-"));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Number is: " + max);
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Number is: " + min);
        return min;
    }

    //? Left Rotate the array by 1 position
    public static void leftRotateByOne(int[] arr) {
        System.out.println("Before leftRotateByOne");
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println("After leftRotateByOne");
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    /*
     * Linear search to find a target
     * Complexity is O(n)
     * */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;  // Element not found
    }

    /*
     ? Binary search to find target
     * This algorithm works on the principle of divide and conquer
     * It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one.
     * It's a much more efficient search algorithm than linear search, especially for large lists.
     * Precondition: Array must be sorted.
     * Complexity is O(log n)
     * */
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  // Element not found
    }

    /*
     * Bubble sort
     * Complexity is O(n2)
     * */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /*
     * Selection sort
     * Complexity is O(n2)
     * */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    /*
     * Complexity: O(n log n)
     * */
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /*
     * Two-pointer Technique
     * This is a popular technique for solving array-related problems, such as finding pairs or triplets with certain properties.
     * */
    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    // ? Sliding window
    // ? Kadane Algorithm

}