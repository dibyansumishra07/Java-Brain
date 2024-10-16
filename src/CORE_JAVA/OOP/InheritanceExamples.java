package CORE_JAVA.OOP;

public class InheritanceExamples {
    InheritanceExamples() {
        System.out.println("Method of: A");
    }

    class B extends InheritanceExamples {

        B() {
            super();
//            this(10); // this will throw error because in the constructor we can either have call to super() or this()
            System.out.println("Method of: B");
        }

        B(int x) {
            System.out.println("Method of: B with int" + x);
        }
    }

}
