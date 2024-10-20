package PROBLEM_SOLVING.DSA.STRING;

public class ReverseAndReplaceString {
    static String reverseWordSequence(String input) {
        String[] words = input.split("\\s+"); // Split the input string into words
        StringBuilder reversedString = new StringBuilder();

        // Reverse the order of words
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        return replaceRepeatedChars(reversedString.toString().trim()); // Return the reversed word sequence
    }
    static String replaceRepeatedChars(String input) {
        StringBuilder modifiedString = new StringBuilder();

        // Loop through the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is the same as the next character
            if (i < input.length() - 1 && currentChar == input.charAt(i + 1)) {
                modifiedString.append('?'); // Replace repeated characters with '?'

                // Skip all consecutive occurrences of the same character
                while (i < input.length() - 1 && currentChar == input.charAt(i + 1)) {
                    i++;
                }
            } else {
                modifiedString.append(currentChar); // Append the character as it is
            }
        }

        return modifiedString.toString(); // Return the modified string
    }
    public static void main(String[] args) {
        String originalString = "Hello, this is a test!";
        String reversedWordSequence = reverseWordSequence(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed Word Sequence: " + reversedWordSequence);
    }
}
