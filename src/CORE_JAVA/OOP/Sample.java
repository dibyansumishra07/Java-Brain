package CORE_JAVA.OOP;

public interface Sample {
    public static void text() {
        System.out.println("Hello static method");
    }

    default void hello() {
        System.out.println("hello default method from Sample");
    }

    abstract void say();
}

interface Check {
    abstract void say();

    default void hello() {
        System.out.println("hello default method from Check");
    }

    static void doSomething() {

    }
}

/**
 * static methods in interface can only be executed by calling it with an interfaceName
 * default methods in interface can only be executed by calling it with an instance of class implementing the interface
 */
class Demo implements Sample, Check {
    @Override
    public void hello() {
        Sample.super.hello();
    }

    @Override
    public void say() {
        System.out.println("This is from say method");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Sample.text();
        demo.say();
        demo.hello();
    }
}
