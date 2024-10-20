package PROBLEM_SOLVING.DSA.STRING;

public class ReverseTheString {
    public static void main(String[] args) {
        reverseTheStringUsingStringBuilder("Good Good");
        String rev = reverseStringUsingRecursion("Helloo");
        System.out.println(rev);
    }

    private static String reverseStringUsingRecursion(String string) {
        if (string.isBlank()) {
            return string;
        } else {
            return reverseStringUsingRecursion(string.substring(1)) + string.charAt(0);
        }
    }

    private static void reverseTheString(String string) {
        String reverseString = "";
        char eachChar;
        for (int i = 0; i < string.length(); i++) {
            eachChar = Character.toLowerCase(string.charAt(i));
            reverseString = eachChar + reverseString;
        }
        System.out.println(reverseString);
    }

    private static void reverseTheStringUsingStringBuilder(String string) {
        System.out.println(new StringBuilder().append(string).reverse());
    }

}
