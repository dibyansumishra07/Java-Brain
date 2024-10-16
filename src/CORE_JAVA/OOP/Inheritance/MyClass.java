package CORE_JAVA.OOP.Inheritance;

class ParentClass {
    int num;
    protected void display() throws ArithmeticException {
        throw new ArithmeticException();
    }
}

class ChildClass extends ParentClass {
    private int num;

    @Override
    public void display() {
        super.display(); // Calls the display() method of the superclass
        System.out.println("Value of num: " + super.num); // Accessing superclass instance variable
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.display();
    }
}

public class MyClass {
    private int num;

    public MyClass() {
        this(0); // Calls the constructor with an int parameter
    }

    public MyClass(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("Value of num: " + this.num); // Accessing instance variable
    }
}
