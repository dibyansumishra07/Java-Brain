package PROBLEM_SOLVING.DSA.STRING;

/*
 * This class demonstrates various operations that can be performed on a String in Java.
 * The String API provides numerous methods for string manipulation and comparison, allowing you to:
 *
 * 1. **Get Length**: You can retrieve the length of a string using the `length()` method.
 * 2. **Access Characters by Index**: Retrieve characters from specific positions in the string using `charAt(index)`.
 * 3. **Retrieve Unicode Information**:
 *    - Use `codePointAt(index)` to get the Unicode code point of the character at a given index.
 *    - Use `codePointBefore(index)` to get the Unicode code point of the character just before a given index.
 *    - Use `codePointCount(beginIndex, endIndex)` to count the Unicode code points between two indices.
 * 4. **String Comparison**: Compare strings lexicographically (alphabetical order):
 *    - `compareTo()` compares strings with case-sensitivity.
 *    - `compareToIgnoreCase()` compares strings without considering case differences.
 * 5. **Check for Substrings**:
 *    - Use `contains()` to check if the string contains a certain substring.
 *    - Use `startsWith()` to check if the string starts with a specific prefix.
 *    - Use `endsWith()` to check if the string ends with a specific suffix.
 * 6. **Find Index of a Character or Substring**:
 *    - Use `indexOf()` to find the first occurrence of a character or substring.
 *    - Use `lastIndexOf()` to find the last occurrence.
 * 7. **String Equality Check**:
 *    - `equals()` checks if two strings are exactly the same.
 *    - `equalsIgnoreCase()` compares two strings, ignoring case.
 *    - `contentEquals()` compares a string with a `StringBuffer` or `StringBuilder`.
 * 8. **Check for Empty or Blank Strings**:
 *    - Use `isEmpty()` to check if the string is empty (zero-length).
 *    - Use `isBlank()` to check if the string is empty or contains only whitespace.
 * 9. **Extract Substrings**:
 *    - Use `substring(beginIndex, endIndex)` to extract a part of the string.
 *    - Use `substring(beginIndex)` to extract from a starting index to the end of the string.
 * 10. **Convert Case**:
 *    - `toUpperCase()` converts the entire string to uppercase.
 *    - `toLowerCase()` converts the entire string to lowercase.
 * 11. **Trim Whitespaces**:
 *    - Use `strip()`, `stripLeading()`, and `stripTrailing()` to remove leading/trailing whitespaces.
 * 12. **String Replacement**:
 *    - `replace(oldChar, newChar)` replaces occurrences of a character with another.
 *    - `replaceAll(regex, replacement)` replaces all substrings matching a regular expression.
 *    - `replaceFirst(regex, replacement)` replaces the first occurrence of a regular expression.
 * 13. **Repetition**:
 *    - Use `repeat(n)` to repeat the string `n` times.
 * 14. **Formatted Strings**:
 *    - Use `formatted()` to format strings similarly to `String.format()`.
 * 15. **Splitting Strings**:
 *    - Use `split(delimiter)` to split the string into an array of substrings based on a delimiter (e.g., spaces).
 *
 * The class also covers:
 * - Converting a string into a byte array with `getBytes()`.
 * - Checking if a string matches a regular expression with `matches()`.
 *
 * Overall, this class demonstrates key string manipulation methods that are useful in day-to-day programming.
 */

public class StringConcept {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println(str.length()); // Output: 12

        /*
        * Find characters from index. And index starts from 0
        * StringIndexOutOfBoundsException will be thrown if n is greater than the length of string
        * */
        System.out.println("Character at n index: "+str.charAt(4)); // Output: 'o'
        // Returns the Unicode code point at the specified index.
        System.out.println("Character at n index: "+str.codePointAt(4));
        System.out.println("str.codePointBefore(4): "+str.codePointBefore(4));
        // ? Check
        System.out.println("str.codePointCount: "+str.codePointCount(0, str.length()));
        // ? Check
        System.out.println("str.codePoints(): "+str.codePoints());

        /*
        * * String comparison:  Compares two strings lexicographically (in dictionary order).
        * Returns positive and negative values
         */
        System.out.println("Compare strings: "+str.compareTo("XYZX"));
        System.out.println("Compare strings: "+str.compareToIgnoreCase("XYZX"));

        /*
        * * Checks if string contains a character
        * */
        System.out.println("String contains 'o': "+str.contains("o")); // Output: true
        /*
        * * Checks if string starts with a specific character
        * */
        System.out.println("String starts with 'H': "+str.startsWith("H")); // Output: true
        /*
        * * Checks if string ends with a specific character
        * */
        System.out.println("String ends with '!': "+str.endsWith("!")); // Output: true
        System.out.println("Checking the first index of a o; "+ str.indexOf("o")); //
        System.out.println("Checking the second index of a o; "+ str.indexOf("o", str.indexOf("o")+1)); //
        System.out.println("Checking the last index of a o; "+ str.lastIndexOf("o")); //
        System.out.println("Checking the index of a hello "+ str.indexOf("Hello")); //

        System.out.println("Comparing Strings using equals "+str.equals("Hello World!"));
        System.out.println("Comparing Strings using equals with ignore case "+str.equalsIgnoreCase("hello world!"));
        System.out.println("Comparing String with String builder/buffer using contentEquals: "+str.contentEquals(new StringBuilder("Hello World!")));

        System.out.println("Check if string is empty or contains only empty spaces: "+ str.isBlank());
        System.out.println("Check if string is null or empty: "+ str.isEmpty());

        byte [] bytes = str.getBytes();

        /*
        * * Extracts a substring from this string.
        * The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
        * */
        System.out.println(str.substring(0, 5)); // Output: "Hello"

        /*
        * * Extracts a substring from this string.
        * The substring begins at the specified beginIndex and extends to the end of this string.
        * */

        String str2 = "Hello, World!";
        System.out.println(str2.substring(6)); // Output: " World!"
        System.out.println(str2.substring(6, 11)); // Output: " World"

        System.out.println(str.toUpperCase()); // Output: "HELLO WORLD!"
        System.out.println(str.toLowerCase()); // Output: "hello world!"
        System.out.println("  Space  ".strip());// Removed spaces from the start and end of the string
        System.out.println("  Space  ".stripLeading());// Removed spaces from the start and end of the string
        System.out.println("  Space  ".stripTrailing());// Removed spaces from the end of the string
        System.out.println("  Space  ".stripIndent());// Removed spaces from the end of the string

        System.out.println(str.replace('l', 'X')); // Output: "HeXo WXrXd!"

        // If a match with a given string
        System.out.println(str.matches("[A-Za-z]+[0-9]+")  );
        // Replaces all occurrences of oldChar with newChar.
        System.out.println(str.replace("o","O"));//
        // ? Replace each occurrence of substring with new string
        System.out.println("String replace: "+str.replace("Hello","hello"));//
        // ? Replace regex
        System.out.println("String replaceAll: "+str.replaceAll("Hello", "hello"));
        // ? Replace only first substring of matched regex
        System.out.println("String replaceAll: "+str.replaceFirst("Hello", "hello"));

        System.out.println("Repeat existing string n time: "+ str.repeat(3));

        // * %S will be replaced with given value in formatted
        String template = "Hello, %s!";
        String result = template.formatted("World");  // "Hello, World!"
        String[] words = str.split(" "); // Output: ["Hello", "World!"]



    }


}
