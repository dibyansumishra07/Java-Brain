package PROBLEM_SOLVING.DSA.BASIC;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(22);
        System.out.println();
        // ? Understand Recursion
        printFibonacciWithRecursion(22l);

    }

    private static void printFibonacciWithRecursion(long num) {
        for (int i = 0; i < num; i++) {
            System.out.print(printFibonacciWithRecursion(i)+" ");
        }
    }
    private static int printFibonacciWithRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacciWithRecursion(n - 1) + printFibonacciWithRecursion(n - 2);
    }

    private static void printFibonacci(int num) {
        //
        int finalNum = 0;
        int secondNum = 1;
        while (finalNum < num) {
            System.out.print(finalNum + " ");
            int nextNum = finalNum + secondNum;
            finalNum = secondNum;
            secondNum = nextNum;
        }
    }
}
