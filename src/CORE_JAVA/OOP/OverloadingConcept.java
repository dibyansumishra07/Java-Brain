package CORE_JAVA.OOP;

public class OverloadingConcept {

    public static void calculate(int x, long y){
        System.out.println("calculate(int x, long y)");
    }
    public static void calculate(Integer x, long y){
        System.out.println("calculate(int x, long y)");
    }
    public static void calculate(Integer x, Integer y){
        System.out.println("calculate(int x, long y)");
    }
    private static void calculate(long x, int y){
        System.out.println("calculate(long x, int y)");
    }
    protected static void calculate(Object x, Object y){
        System.out.println("calculate(Object x, Object y)");
    }
    private static void calculate(String string, StringBuffer sbuffer){
        System.out.println("calculate(String string, StringBuffer sbuffer)");
    }
    private static void calculate(StringBuffer stringBuffer, String string){
        System.out.println("calculate(StringBuffer stringBuffer, String string)");
    }
    public static void main(String[] args) {
        calculate(null, "null");
    }
}
