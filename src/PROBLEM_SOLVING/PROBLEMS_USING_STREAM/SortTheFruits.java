package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheFruits {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Avocado", "Grape", "Apricot", "Blueberry", "Blackberry", "Boysenberry", "Cherry", "Cranberry", "Dragonfruit", "Eggfruit");
        groupFruits(fruits);
    }

    private static void groupFruits(List<String> fruits) {
        // ! Group by fruit name initials
        Map<Character, List<String>> group = fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));

        // ! Sort the map with the length of the value
        group.entrySet().stream().sorted(Comparator.comparingInt(e -> e.getValue().size())).forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });

        System.out.println("-------------");

        // ! Sort the map with the length of the value in reverse order
        group.entrySet().stream().sorted(Comparator.comparingInt((Map.Entry<Character, List<String>> e) -> e.getValue().size()).reversed()).forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println("-------------");
    }
}
