package PROBLEM_SOLVING.DSA.ARRAY;

public class SecondHighestElementInArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 0, 4, 0, 5, 0, 4, 0, 2, 0, 1, -2, -3, 0, 4, 5, 0};
        int[] arr = {1, 1};

        int maxNumber = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > maxNumber){
               secondMax = maxNumber;
               maxNumber = arr[i];
           } else if(arr[i] > secondMax && maxNumber != arr[i]){
                secondMax = arr[i];
           }
        }
        System.out.println(secondMax == Integer.MIN_VALUE?"No Values":secondMax);
    }
}
