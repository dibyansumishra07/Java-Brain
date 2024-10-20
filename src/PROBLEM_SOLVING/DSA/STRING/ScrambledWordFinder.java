package PROBLEM_SOLVING.DSA.STRING;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * This class provides methods to find a matching word from a given list of words using characters from a note.
 */
public class ScrambledWordFinder {
    public static void main(String[] args) {
        // Example word list and notes
        List<String> words = List.of("baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz");

        String testCase1 = "ctay";//Cat
        String testCase2 = "bcanihjsrrrferet";//Cat
        String testCase3 = "tbaykkjlga";//_
        String testCase4 = "bbbblkkjbaby";//baby
        String testCase5 = "dad";//_
        String testCase6 = "breadmaking";//bird
        String testCase7 = "dadaa";//dada
        System.out.println(find( words, testCase1));
    }


    /**
     * Checks if a word can be formed using the characters in the note.
     *
     * @param word The word to check.
     * @param note The note containing characters to form the word.
     * @return True if the word can be formed using the characters in the note, false otherwise.
     */
    private static boolean canFormWord(String word, String note) {
        // Create a frequency map for the characters in the note
        Map<Character, Integer> noteCharCount = new HashMap<>();
        for (char ch : note.toCharArray()) {
            noteCharCount.put(ch, noteCharCount.getOrDefault(ch, 0) + 1);
        }

        // Check if the word can be formed using the characters in the note
        for (char ch : word.toCharArray()) {
            if (!noteCharCount.containsKey(ch) || noteCharCount.get(ch) == 0) {
                return false;
            }
            // Decrement the count of the used character
            noteCharCount.put(ch, noteCharCount.get(ch) - 1);
        }

        return true;
    }

    /**
     * Finds the matching word in the list using characters from the note.
     *
     * @param words The list of words to search.
     * @param note  The note containing characters to form a word.
     * @return The matching word if found, "-" otherwise.
     */
    private static String find(List<String> words, String note) {
        // Iterate through each word in the list
        for (String word : words) {
            // If the word can be formed using characters from the note, return it
            if (canFormWord(word, note)) {
                return word;
            }
        }
        // If no word is found, return "-"
        return "-";
    }


}

