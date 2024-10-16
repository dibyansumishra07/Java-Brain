package PROBLEM_SOLVING.JAVA_PATTERNS_PRINTING;

public class StarPatterns {
    public static void main(String[] args) {
//        printNumberIncreasing(6);
        printNumberDecreasing(6);
//        printPyramid(5);
    }

    private static void printNumberDecreasing(int limit) {
        for(int i = limit; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void printNumberIncreasing(int limit) {
        for(int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void printPyramid(int i) {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i - j - 1; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 2 * j + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
