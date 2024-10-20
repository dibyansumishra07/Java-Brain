package PROBLEM_SOLVING.DSA.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        productExceptSelfInvalid(arr);
        productExceptSelfBruteForce(arr);
        productExceptSelfOptimal(arr);
        productExceptSelfOptimalWithSpaceComplexity(arr);

    }

    private static void productExceptSelfOptimalWithSpaceComplexity(int[] arr) {
        int arrSize = arr.length;
        int[] resultArr = new int[arrSize];
        resultArr[0] = 1;// Setting this one as first element of array will not have any prefix
        //Calculate prefix
        for (int i = 1; i < arrSize; i++) {
            resultArr[i] = arr[i-1] * resultArr[i-1];
        }

        int suffix = 1;
        //Calculate suffix
        for (int i = arrSize - 2; i >= 0 ; i--) {
            suffix = suffix * arr[i+1];
         resultArr[i] *= suffix;
        }
        System.out.println();
        Arrays.stream(resultArr).forEach(System.out::print);
    }

    /*
     * Time and Space complexity: O (n)
     * */
    private static void productExceptSelfOptimal(int[] arr) {
        int arrSize = arr.length;
        int[] resultArr = new int[arrSize];
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        for (int i = 0; i < arrSize; i++) {
            int prefixProd = list.subList(0, i).stream().mapToInt(num -> num).reduce(1, (a, j) -> a * j);
            int sufixProd = list.subList(i + 1, arrSize).stream().mapToInt(num -> num).reduce(1, (a, j) -> a * j);
            int finalProd = prefixProd * sufixProd;
            resultArr[i] = finalProd;
        }
        System.out.println();
        Arrays.stream(resultArr).forEach(System.out::print);
    }

    private static void productExceptSelfBruteForce(int[] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i)
                    product = product * arr[j];
            }
            resultArr[i] = product;
        }
        System.out.println("--");
        Arrays.stream(resultArr).forEach(System.out::print);
    }

    private static void productExceptSelfInvalid(int[] arr) {
        int[] resultArr = new int[arr.length];
        int allProducts = 1;
        for (int i = 0; i < arr.length; i++) {
            allProducts = allProducts * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = allProducts / arr[i];
        }
        Arrays.stream(resultArr).forEach(System.out::print);
    }
}
