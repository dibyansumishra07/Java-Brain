public class QuickRun {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}