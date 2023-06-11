package BackToBasics.oopsConcepts;

public interface Sample {
    public static void text() {
        System.out.println("Hello static method");
    }
    default void hello(){
        System.out.println("hello default method");
    }
}

/**
 * static methods in interface can only be executed by calling it with an interfaceName
 * default methods in interface can only be executed by calling it with an instance of class implementing the interface
 */
class Demo implements Sample {
    public static void main(String[] args) {
        Sample.text();
        new Demo().hello();
    }
}
