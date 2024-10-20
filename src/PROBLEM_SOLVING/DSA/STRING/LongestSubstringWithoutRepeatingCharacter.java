package PROBLEM_SOLVING.DSA.STRING;
/*
 * Input: "ABCBC"
 * Output: "abc"
 * */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String input1 = "abcabcbb";//3
        String input2 = "bbbbb";//1
        String input3 = "pwwkew";//3
        String input4 = "abcd";//4
        String input5 = "aab";//2
        String input6 = "dvdf";//3
        String input7 = "au";//2
        String input8 = "tmmzuxt";//6
        String input9 = "abacdfgdcaba";//6
        String input10 = "aabacbb";//3

        String inputString = input1;
        System.out.println("Length of longest substring without repeating characters: " + longestSubstring(inputString));
        System.out.println("Length of longest substring without repeating characters: " + longestSubstringBruteForce(inputString));
        System.out.println("Length of longest substring without repeating characters: " + longestNonRepSubstringByCheckingAllPossibleSubArray(inputString));
    }

    private static int longestSubstringBruteForce(String input) {
        int maxLength = 0;
        List<Character> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (list.contains(c)) {
                // Remove all characters up to and including the repeated character
                while (list.contains(c)) {
                    list.remove(0);  // Remove from the front of the list
                }
            }
            list.add(c);  // Add the new character to the list
            maxLength = Math.max(maxLength, list.size());  // Update max length
        }
        return maxLength;
    }

    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0; // Start pointer

        for (int right = 0; right < s.length(); right++) {
            // If the character is already in the set, remove characters from the left to shrink the window
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(set);
        return maxLength;
    }

    /**
     * @param input
     * @return
     * @implNote Idea is to create all possible sub-arrays from character array of the string
     * and check which one is longest.
     * To achieve this we have to
     * - Loop over all the characters of the string
     * - Create a substring using string builder
     * - Then check the next character is present in the string builder or not
     * - If present: break the loop and start again from the next element of the string
     * - If not present: continue the loop and append to the end of the string builder
     */
    private static int longestNonRepSubstringByCheckingAllPossibleSubArray(String input) {
        int maxLength = 0;

        for (int i = 0; i < input.length(); i++) {
            StringBuilder currentSubString = new StringBuilder();
            for (int j = i; j < input.length(); j++) {
                if (currentSubString.indexOf(String.valueOf(input.charAt(j))) != -1){
                    break;
                }
                currentSubString.append(input.charAt(j));
                maxLength = Math.max(maxLength, currentSubString.length());
            }
        }

        return maxLength;
    }
}

