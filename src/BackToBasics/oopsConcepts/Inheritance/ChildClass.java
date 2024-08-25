package BackToBasics.oopsConcepts.Inheritance;

public class ChildClass extends ParentClass {
    private int num;

    public void display() {
        super.display(); // Calls the display() method of the superclass
        System.out.println("Value of num: " + super.num); // Accessing superclass instance variable
    }
}

