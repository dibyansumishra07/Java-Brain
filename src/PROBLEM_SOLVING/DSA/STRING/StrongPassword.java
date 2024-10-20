package PROBLEM_SOLVING.DSA.STRING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    /*
     * Check the length should be greater than Zero and smaller than 100
     * Take 4 flags for strong pass check and make it false
     *      - foundSpecialChar
     *      - foundLowerCase
     *      - foundUpperCase
     *      - foundNumber
     * Take a int to return
     * iterate the string and update the flags
     * Check how many flags are still false add those much value to the return int
     * Add return int to the password length and it should be greater than or euqal to 6 if not
     *      - Substract the total value from 6 and add that value to return int
     * */
    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        boolean check = m.find();

        int countTobeAdded = 0;
        if (n >= 1 && n <= 100 && !password.isEmpty()) {
            boolean foundSpecialChar = false;
            boolean foundLowerCase = false;
            boolean foundUpperCase = false;
            boolean foundNumber = false;
            countTobeAdded = 0;

            foundSpecialChar = check ? true : false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    foundUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    foundLowerCase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    foundNumber = true;
                }
            }

            countTobeAdded+=foundSpecialChar?0:1;
            countTobeAdded+=foundLowerCase?0:1;
            countTobeAdded+=foundUpperCase?0:1;
            countTobeAdded+=foundNumber?0:1;
        }
        return n + countTobeAdded < 6 ? 6 - n : countTobeAdded;


    }

    public static void main(String[] args) {
        String password = "PZ123414123412%$WSs";
        System.out.println(minimumNumber(password.length(), password));
    }
}
