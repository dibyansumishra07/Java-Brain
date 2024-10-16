package CORE_JAVA.OOP;

public class ObjectCount {

    static int count = 0;

    public ObjectCount() {
        count++;
        System.out.println("Object Created: " + count);
    }

    public static void main(String[] args) {
        ObjectCount ob0 = new ObjectCount();
        ObjectCount ob1 = new ObjectCount();
        ObjectCount ob3 = new ObjectCount();
        ObjectCount ob4 = new ObjectCount();
        ObjectCount ob5 = new ObjectCount();
        System.out.println();
        System.out.println("Total Object Created: " + count);
    }
}
