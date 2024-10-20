package PROBLEM_SOLVING.DSA.STRING;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] check) {
        System.out.println(checkAnagram("Silent", "Listen"));
    }

    protected static boolean checkAnagram(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;

        char[] stringArr = string1.toLowerCase().toCharArray();
        char[] string2Arr = string2.toLowerCase().toCharArray();

        Arrays.sort(stringArr);
        Arrays.sort(string2Arr);
        return Arrays.equals(stringArr, string2Arr);
    }

}


