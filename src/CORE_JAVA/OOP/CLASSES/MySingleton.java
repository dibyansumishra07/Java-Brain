package CORE_JAVA.OOP.CLASSES;

public class MySingleton {
    // Private static instance variable to hold the single instance of the class
    private static MySingleton instance;
    // Private constructor to prevent instantiation from outside the class
    private MySingleton() {
        // Constructor implementation
    }
// Public static method to provide access to the single instance of the class
    public synchronized static MySingleton getInstance() {
// Lazy initialization: create the instance only if it hasn't been created yet
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
    // Other methods and variables can be added as needed
}