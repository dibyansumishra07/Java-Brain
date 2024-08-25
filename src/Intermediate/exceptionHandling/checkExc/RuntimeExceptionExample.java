package Intermediate.exceptionHandling.checkExc;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Attempt to access an array element beyond its bounds
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.err.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
