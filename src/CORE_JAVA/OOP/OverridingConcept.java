package CORE_JAVA.OOP;
interface IParent{
    public void print();
    default void hello(){
        System.out.println("Hello default method from IParent");
    }
}
interface IParent1{
    public void print() throws Exception;
    public void print1() throws Exception;
    default void hello(){
        System.out.println("Hello default method from IParent1");
    }
}
class CParent{
    public void print(){
        System.out.println("Printing in CParent");
    }
    public void hello(){
        System.out.println("Hello default method from CParent");
    }
}
public class OverridingConcept extends CParent implements IParent, IParent1{
    public static void main(String[] args) {
        OverridingConcept overridingConcept = new OverridingConcept();
        overridingConcept.print();
    }

    @Override
    public void print1() {

    }
}
