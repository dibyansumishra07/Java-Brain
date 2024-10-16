package CORE_JAVA.OOP.innerClasses;

public class LocalInnerClass {
    public void display() {
        int localVar = 10;
        class LocalInner {
            public void displayLocal() {
                System.out.println("Local variable: " + localVar);
            }
        }
        LocalInner inner = new LocalInner();
        inner.displayLocal();
    }
}

