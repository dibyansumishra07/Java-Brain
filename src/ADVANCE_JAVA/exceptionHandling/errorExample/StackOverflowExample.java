package ADVANCE_JAVA.exceptionHandling.errorExample;

public class StackOverflowExample {
    public static void main(String[] args) {
        // Call a method that recursively calls itself indefinitely
        infiniteRecursion();
    }

    public static void infiniteRecursion() {
        // Call itself recursively
        infiniteRecursion();
    }
}

