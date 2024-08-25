package Strings;

public class StringExamples {
    public static void main(String[] args) {
        StringExamples se = new StringExamples();
        se.reverseTheStringUsingStringBuilder("Good Good");
    }

    private void reverseTheString(String string) {
        String reverseString = "";
        char eachChar;
        for (int i = 0; i < string.length(); i++) {
            eachChar = Character.toLowerCase(string.charAt(i));
            reverseString =eachChar+reverseString;
        }
        System.out.println(reverseString);
    }
    private void reverseTheStringUsingStringBuilder(String string) {
        System.out.println(new StringBuilder().append(string).reverse());
    }

}
