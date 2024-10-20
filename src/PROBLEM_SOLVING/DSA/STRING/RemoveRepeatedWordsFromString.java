package PROBLEM_SOLVING.DSA.STRING;

import java.util.*;

public class RemoveRepeatedWordsFromString {

    public static String superReducedStringFromGoogle(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek()==ch)
                stack.pop();
            else
                stack.push(ch);
        }
        if(stack.isEmpty())
            return "Empty String";
        else
        {
            StringBuilder sb = new StringBuilder();
            while(!stack.isEmpty())
            {
                sb.append(stack.peek());
                stack.pop();
            }
            sb.reverse();
            String result = String.valueOf(sb);
            return result;
        }
    }
    public static String superReducedString(String s) {
        if (s.length() >= 1 && s.length() <= 100) {
            char[] charArr = s.toCharArray();
            List<Character> charList = new ArrayList<>();
            List<Character> charListFinal = new ArrayList<>();
            Map<Character, Integer> charCount = new HashMap<>();
            String finalString;
            for (char c : charArr) {
                charList.add(c);
                charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
            }
//        charList.stream().forEach(item -> System.out.println(item));
            for (Map.Entry entry : charCount.entrySet()) {
                if ((Integer) entry.getValue() % 2 != 0) {
                    charListFinal.add((Character) entry.getKey());
                }
                System.out.println(entry.getKey() + " ---" + entry.getValue());

            }
            StringBuilder sb = new StringBuilder();

            for (Character ch : charListFinal) {
                sb.append(ch);
            }
            return sb.toString().isBlank()?"Empty String":sb.toString();
        }
        return "";


    }

    public static void main(String[] args) {
        System.out.println(RemoveRepeatedWordsFromString.superReducedString("txxmubonuhlaryeuujgftedrmmhmaadxrplneqpwhsketqicdpqlecluydmgykrubgmpwfqviabkjoiqdftbbwwgiuudmgrdbkrr"));
    }
}
