package CORE_JAVA.VARIABLE;

public class ArrayConcept {
    public static void main(String[] args) {
        exploreMultiDimensionalArray();
    }

    private static void exploreMultiDimensionalArray() {
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}};
        int[][] threeDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSumOf2DArray(twoDArray);
        printSumOf3DArray(threeDArray);
        printSumOf2D3DArray(twoDArray);
    }

    private static void printSumOf2D3DArray(int[][] twoDArray) {

    }

    private static void printSumOf3DArray(int[][] multiDArray) {
        int[] sumArrays = new int[multiDArray[0].length];
        for (int i = 0; i < multiDArray[0].length; i++) {
            sumArrays[i] = multiDArray[0][i]+multiDArray[1][i]+multiDArray[2][i];
        }
        for (int i : sumArrays){
            System.out.print(i+"-");
        }
    }

    private static void printSumOf2DArray(int[][] twoDArray) {
        int[] sumArrays = new int[twoDArray[0].length];
        for (int i = 0; i < twoDArray[0].length; i++) {
            sumArrays[i] = twoDArray[0][i]+twoDArray[1][i];
        }
        for (int i : sumArrays){
            System.out.println(i);
        }
    }
}
