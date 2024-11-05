package ADVANCE_JAVA.EXCEPTION_HANDLING.exceptionConcept;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to load a class dynamically
            Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException e) {
            // Handle the ClassNotFoundException
            System.err.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}
