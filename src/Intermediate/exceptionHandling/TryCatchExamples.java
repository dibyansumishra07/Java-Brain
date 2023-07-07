package exceptionHandling;

public class TryCatchExamples {

	public static void main(String[] args) {

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
