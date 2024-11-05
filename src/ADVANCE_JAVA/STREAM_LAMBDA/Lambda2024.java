package ADVANCE_JAVA.STREAM_LAMBDA;

import CORE_JAVA.ABSTRACT_INTERFACE.FunctionalExample;
import CORE_JAVA.ABSTRACT_INTERFACE.FunctionalInterfaceMethodParam;

/*
* This was introduced in java 8
* We can use it with only on functional interface(E,g, Runnable, Callable, and Comparable)
* It is an anonymous function with no name, modifier, and return type
* Benefits
*   - Reduce lines of code
*   - Call APIs very effectively
*   -
* How
*   - If we have one statement in lambda function then we can skip {}
*   - defining variable type in lambda fuction param is not needed as it will auto refer the type
*   -
* */
public class Lambda2024 {
    public static void main(String[] args) {
        //consumeFunctionalInterfaces();
        System.out.println(lamdaWithReturnType());
    }

    private static int lamdaWithReturnType() {
        FunctionalInterfaceDemo fiDemo = (i) -> {
            System.out.println("Method Body");
            return  2;
        };
        return fiDemo.write(9);
    }


    private static void consumeFunctionalInterfaces() {
        // Using a new class itself and implement interface and override

        // Using anonymous class
        FunctionalExample functionalExample = new FunctionalExample() {
            @Override
            public void show() {
                System.out.println("Anonymous class");
            }
        };
        functionalExample.show();
        // Using Lambda
        FunctionalExample functionalExample1 = () -> {
            System.out.println("Functional Interface using lambda");
        };
        functionalExample1.show();

        // Using lambda more effectively
        FunctionalExample functionalExample3 = () -> System.out.println("Functional Interface using lambda without class body");
        functionalExample3.show();

        // labmda with parameter
        FunctionalInterfaceMethodParam functionalInterfaceMethodParam = (int x, int y) -> {
          return x + y;
        };

        FunctionalInterfaceMethodParam functionalInterfaceMethodParam2 = (x,  y) -> x + y;
        System.out.println(functionalInterfaceMethodParam.sum(1,2));
        System.out.println(functionalInterfaceMethodParam2.sum(1,2));

    }

    private static void createThreadUsingLambda() {
        // First Thread
        Runnable thread1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("Diby");
        t.start();
        ;

    }
}
