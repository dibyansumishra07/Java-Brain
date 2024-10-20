package PROBLEM_SOLVING.DSA.STRING;

public class StringConstantPoolConcept {
    public static void main(String[] args) {
        String s1 = "value";
        String s2 = "value";
        String str = "Hello World!";

        String sNew3 = new String("value");

        // Comparing the address of S1 and S2 to check whether both are pointing to the same address
        if(s1 == s2){
            System.out.println("s1 == s2 is true");
        }
        // Comparing the address of S1 and S3 to check whether both are pointing to the same address
        if(s1 == sNew3){
            System.out.println("s1 == sNew3 is true");
        }
        // Comparing the address of S1 and S2 to check whether both are pointing to the same address
        if(s1.equals(s2)){
            System.out.println("s1 equals s2 is true");
        }

        StringBuilder stringBuilder = new StringBuilder("Hello World!");
        StringBuffer stringBuffer = new StringBuffer("Hello World!");
        System.out.println(str == stringBuffer.toString());// false
        System.out.println(str == stringBuilder.toString());// false
        System.out.println(str.equals(stringBuffer.toString()));// true
        System.out.println(str.equals(stringBuilder.toString()));// true
        System.out.println(str.contentEquals(stringBuffer));// true: This is a method from string which we can't use with others.
        System.out.println(str.contentEquals(stringBuilder));// true: This is a method from string which we can't use with others.
        System.out.println(str.equals(stringBuffer));// false
        System.out.println(str.equals(stringBuilder));// false
        System.out.println(stringBuffer.equals(stringBuilder));// false

    }
}
