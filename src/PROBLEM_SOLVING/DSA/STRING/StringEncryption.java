package PROBLEM_SOLVING.DSA.STRING;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEncryption {
    public static void main(String[] args) {
        System.out.println(getEncryptedString("middle-Outz",2));
    }


    private static String getEncryptedString(String s, int incrementCount) {
        char[] sArr = s.toCharArray();
        char[] sArr2;
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        boolean check = m.find();

        for (int i = 0; i < s.length(); i++) {
            if(!p.matcher(Character.toString(s.charAt(i))).find()) {
                sArr[i] = (char) (s.charAt(i) + incrementCount);
            }
            else{
                sArr[i] = s.charAt(i);
            }
        }
        return new String(sArr);
    }
}
