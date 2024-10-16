package PROBLEM_SOLVING.JAVA_PATTERNS_PRINTING;

public class JavaPatterns {
    public static void main(String[] args) {
        printPattern1(5);
        printPattern2(5);
        printPattern3(5);
        printPattern4(5);
    }

    private static void printPattern4(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = i; k > j; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= 2 * j - 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = i - 1; j >= 1; j--) {
            for (int k = i; k > j; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= 2 * j - 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printPattern3(int i) {
        for (int j = 1; j <= i; j++) {
            for (int k = i; k > j; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= 2 * j - 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printPattern2(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void printPattern1(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
