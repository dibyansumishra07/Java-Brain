package BackToBasics.oopsConcepts;

public class PolymerphismExample {

    public static void main(String[] args) {
        PolymerphismExample pe = new PolymerphismExample();
        pe.add(5,5L);
    }

    private void add(int i, long i1) {
        System.out.println("intlong: "+i+i1);
    }
    private void add(long i, int i1) {
        System.out.println("longint: "+i+i1);
    }
    private void add(int i, int i1) {
        System.out.println("intint: "+i+i1);
    }
}
