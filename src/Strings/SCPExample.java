package Strings;

public class SCPExample {
    public static void main(String[] args) {
        String s1 = "value";
        String s2 = "value";
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
    }
}
