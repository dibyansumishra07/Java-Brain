package CORE_JAVA.OOP.Inheritance;
interface IParent{
    public void print();
    default void printDefault(){
        System.out.println("IParent print default");
    }
}
interface IParent1{
    public void print();
    default void printDefault(){
        System.out.println("IParent1 print default");
    }
}
class Parent{
    public void  print(){
        System.out.println("Printing in parent");
    }
    public void printDefault() {
        System.out.println("Parent print default");
    }
}
class Child extends Parent implements IParent, IParent1{
    @Override
    public void print(){
        System.out.println("Printing in child");
    }

    public int print(int x){
        System.out.println("Printing in child");
        return 1;
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.printDefault();
        // Call print of parent through child
        Parent parent = (Child) new Child();
        parent.print();
    }
}
