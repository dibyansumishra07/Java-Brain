package problemsolving.DSA.string;

import java.util.Arrays;

public class StringExplore {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str2 = "Hello, World!";
//        String str3 = "Hello World!";

        System.out.println(str.length()); // Output: 12
        System.out.println(str.charAt(4)); // Output: 'o'

        System.out.println(str2.substring(6)); // Output: " World!"
        System.out.println(str2.substring(6, 11)); // Output: " World"

        System.out.println(str.toUpperCase()); // Output: "HELLO WORLD!"
        System.out.println(str.toLowerCase()); // Output: "hello world!"

        System.out.println(str.replace('l', 'X')); // Output: "HeXo WXrXd!"

        String[] words = str.split(" "); // Output: ["Hello", "World!"]

        StringBuilder stringBuilder = new StringBuilder("Hello World!");
        StringBuffer stringBuffer = new StringBuffer("Hello World!");
        System.out.println(str == stringBuffer.toString());// false
        System.out.println(str == stringBuilder.toString());// false
        System.out.println(str.equals(stringBuffer.toString()));// true
        System.out.println(str.equals(stringBuilder.toString()));// true
        System.out.println(str.contentEquals(stringBuffer));// true: This is a method from string which we can't use with others.
        System.out.println(str.contentEquals(stringBuilder));// true: This is a method from string which we can't use with others.
        System.out.println(str.equals(stringBuffer));// false
        System.out.println(str.equals(stringBuilder));// false
        System.out.println(stringBuffer.equals(stringBuilder));// false

    }
}
