package ADVANCE_JAVA.EXCEPTION_HANDLING.exceptionConcept;
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}
public class CheckedVsUncheckedExceptionConcept {
    // Checked exceptions need to be handled using try-catch block
    public static void handleCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("Checked exception occurred");
    }
    // Unchecked exceptions do not need to be handled using try-catch block
    public static void handleUncheckedException() throws CustomUncheckedException {
        throw new CustomUncheckedException("Unchecked exception occurred");
    }

    public static void main(String[] args) {
        try {
            handleCheckedException();
        } catch (CustomCheckedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Handled Exception");
        }
        handleUncheckedException();
    }
}
