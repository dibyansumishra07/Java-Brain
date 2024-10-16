package CORE_JAVA.OOP;

public class StateOfAVariable {
    public void printVariable(){
        Integer integer = new Integer(5);
        integer = 5;
        System.out.println(integer);
        changeVariable(integer);
    }

    private void changeVariable(Integer integer) {
        integer = 6;
    }

    public static void main(String[] args) {

    }
}
