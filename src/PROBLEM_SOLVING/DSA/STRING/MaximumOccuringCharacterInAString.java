package PROBLEM_SOLVING.DSA.STRING;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumOccuringCharacterInAString {
    public static void main(String[] args) {
        findHighestRepetativeChar("Hello");
    }

    private static void findHighestRepetativeChar(String string) {
        Map<Character, Long> charCountMap = string.toLowerCase().chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        //*long max = charCountMap.values().stream().max((i,j)->i.compareTo(j)).get();// Find maximum value of a map
        long max = Collections.max(charCountMap.values());//Another way to find maximum

        charCountMap.entrySet().stream().filter(i -> max == i.getValue()).toList().forEach(System.out::println);

    }
}
