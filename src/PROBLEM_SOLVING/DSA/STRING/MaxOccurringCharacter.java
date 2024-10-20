package PROBLEM_SOLVING.DSA.STRING;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {
    public static char findMaxOccurringCharUsingHashmap(String str) {
        // Create a hashmap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Increment the count for the current character
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with maximum occurrence
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }

    public static char findMaxOccurringCharOneLoop(String str) {
        // Assuming ASCII characters (0-255)
        int[] charCount = new int[256];
        char maxChar = ' ';
        int maxCount = 0;

        // Iterate over each character in the string and update count
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount[currentChar]++;
            if (charCount[currentChar] > maxCount) {
                maxChar = currentChar;
                maxCount = charCount[currentChar];
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        char maxChar = findMaxOccurringCharUsingHashmap(str);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}

