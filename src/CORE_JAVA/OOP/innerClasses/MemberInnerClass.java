package CORE_JAVA.OOP.innerClasses;

public class MemberInnerClass {
    private int outerField;

    public class InnerClass {
        public void display() {
            System.out.println("Outer field: " + outerField);
        }
    }
}
