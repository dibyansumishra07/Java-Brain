package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.List;

public class MakeLastNameToUpperCase {
    public static void main(String[] args) {
        List<String> nameList = List.of("dibm mis", "dibpandey");
        makeLasNameUpperCase(nameList);
    }

    static String surNameToUpperCase(String s){
        if(!s.contains(" ")){
            return s;  // If there is no space, return the name as it is.  e.g., "John" -> "John"  "Doe" -> "Doe"  "John Doe" -> "John Doe"  "Doe, John" -> "Doe, John"  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr." -> "John Doe, Jr."  "John Doe, Jr."
        } else {
            int indexOfSpace = s.indexOf(" ");
            String upperCaseSurname = s.substring(0,indexOfSpace) + " " + Character.toUpperCase(s.charAt(indexOfSpace+1))+s.substring(indexOfSpace+2);
            return upperCaseSurname;
        }
    };

    private static void makeLasNameUpperCase(List<String> nameList) {
        nameList.stream().map(i ->surNameToUpperCase(i)).forEach(System.out::println);
    }
}
