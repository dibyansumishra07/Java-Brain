package ADVANCE_JAVA.EXCEPTION_HANDLING.errorExample;

public class VirtualMachineErrorExample {
    public static void main(String[] args) {
        try {
            // Simulate a condition that causes a VirtualMachineError
            throw new InternalError("Simulated internal error");
        } catch (VirtualMachineError e) {
            // Handle the VirtualMachineError
            System.err.println("VirtualMachineError occurred: " + e.getMessage());
        }
    }
}
