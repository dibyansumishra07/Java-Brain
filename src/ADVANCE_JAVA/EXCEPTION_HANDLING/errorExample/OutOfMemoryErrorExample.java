package ADVANCE_JAVA.EXCEPTION_HANDLING.errorExample;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    static int totalObjectAdded = 0;
    public static void main(String[] args) {
        throwOutOfMemoryException();
    }

    public static void throwOutOfMemoryException() {
        try {
            // Simulate running out of memory
            List<Object> list = new ArrayList<>();
            while (true) {
                list.add(new Object());
                totalObjectAdded++;
            }
        } catch (OutOfMemoryError e) {
            // Handle the OutOfMemoryError
            System.out.println("totalObjectAdded = " + totalObjectAdded);
            System.err.println("OutOfMemoryError occurred: " + e.getMessage());
        }
    }
}
