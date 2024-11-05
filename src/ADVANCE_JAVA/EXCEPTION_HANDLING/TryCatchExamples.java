package ADVANCE_JAVA.EXCEPTION_HANDLING;

public class TryCatchExamples {

    public static void main(String[] args) {
        tryCatchSequence();
//		tryCatch2022();
    }

    private static void tryCatchSequence() {
        try {
            System.out.println("Inside Try");
//			System.exit(0);
            int x = 10 / 0;
            System.out.println("Inside Try but after exception occured");
        } catch (Exception e) {
            System.out.println("Inside Catch Block");
            int x = 10 / 0;
            System.out.println("Inside catch but after exception occured");
        } finally {
            System.out.println("Inside Finally Block");
        }
    }

    private static void tryCatch2022() {
        try {
            String str = null;
            int x = 0;
            // Once System.exit() will called then finally will not executed
            // System.exit(x);
            int y = Integer.parseInt(str);
            System.out.println("In TRY END");
        } catch (NumberFormatException e) {
            System.out.println("Exception Occurred");
        } finally {
            System.out.println("Finally Block");
        }
        try {
            temp();
            System.out.println("try of main block");
        } catch (ArithmeticException e) {
            System.out.println("in main exception handler");
        } finally {
            System.out.println("main finally block");
        }
    }

    static int temp() {
        try {
            return 10 / 0;
        } finally {
            System.out.println("finally of temp method");
            return 0;
        }
    }

}
