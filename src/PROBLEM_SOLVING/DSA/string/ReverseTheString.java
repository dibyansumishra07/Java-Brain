package PROBLEM_SOLVING.DSA.string;

public class ReverseTheString {
    public static void main(String[] args) {
        reverseTheStringUsingStringBuilder("Good Good");
    }

    private static void reverseTheString(String string) {
        String reverseString = "";
        char eachChar;
        for (int i = 0; i < string.length(); i++) {
            eachChar = Character.toLowerCase(string.charAt(i));
            reverseString =eachChar+reverseString;
        }
        System.out.println(reverseString);
    }
    private static void reverseTheStringUsingStringBuilder(String string) {
        System.out.println(new StringBuilder().append(string).reverse());
    }

}
