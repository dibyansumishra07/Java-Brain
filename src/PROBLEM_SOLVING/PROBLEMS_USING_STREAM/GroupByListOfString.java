package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByListOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        countEachElementRepetation(list);
        groupCountEachElementByFirstLetter(list);
    }

    private static void countEachElementRepetation(List<String> list) {
//        Map<String, Long> grouped =
        list.stream().collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting())).forEach((i, j) -> System.out.println(i + " is present " + j));


    }

    private static void groupCountEachElementByFirstLetter(List<String> list) {
        Map<Character, Long> grouped = list.stream().collect(Collectors.groupingBy(i -> i.charAt(0), Collectors.counting()));
        grouped.entrySet().stream().sorted((i, j) -> i.getValue().compareTo(j.getValue())).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
//        System.out.println(grouped);
    }
}
