package PROBLEM_SOLVING.DSA.STRING;

public class CheckForASpecificString {
    public static void main(String[] args) {

        String dbValue="Indv ID:1";
        if(null!=dbValue && dbValue.contains("Indv ID:")){
            System.out.println(dbValue.split(":")[1]);
        }
    }
}
