package PROBLEM_SOLVING.DSA.STRING;

import java.util.HashMap;
import java.util.Map;

public class StringManipulations {
    public static void main(String[] args) {
        splitTheString("DibyansuMishra");
        findRepetitiveCharacter("Hello");
        maskingString("act100099999");

    }

    private static void maskingString(String string) {
        StringBuilder sb = new StringBuilder(string);
        for(int i = 3 ; i < 7; i++){
            sb.setCharAt(i,'X');
        }
        System.out.println(sb);
    }

    private static void findRepetitiveCharacter(String string) {
        char[] charArr = string.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        int maxOccurance = 0;
        char maxChar = 0;
        for (char c : charArr) {
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            if ((Integer) entry.getValue() > maxOccurance) {
                maxOccurance = (Integer) entry.getValue();
                maxChar = (Character) entry.getKey();
            }
        }
        System.out.println(maxChar + "" + maxOccurance);
    }

    private static void splitTheString(String string) {
        String[] strArr = string.split("M");
        System.out.println(strArr[0]+" "+strArr[1]);
    }
}
