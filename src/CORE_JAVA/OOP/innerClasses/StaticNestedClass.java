package CORE_JAVA.OOP.innerClasses;

public class StaticNestedClass {
    private static int outerStaticField;
    int x = 10;

    public static class NestedClass {
        public void display() {
            System.out.println("Outer static field: " + outerStaticField);
        }
    }
}
