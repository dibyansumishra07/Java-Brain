package BackToBasics.oopsConcepts.Inheritance;

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
