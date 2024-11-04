package ADVANCE_JAVA.COLLECTION_FRAMEWORK.List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListInterfaceExamples {

    public static void main(String[] args) {

        // Different ways to initialize a list
        Arrays.asList(1, 2);
        List<String> list2 = Arrays.asList("apple", "banana", "orange");
        List<Integer> numberList = Arrays.asList(2, 40, 50, 60, 78, 79, 77, 65);
        List<String> list4 = new ArrayList<>();
        list4.add("apple");
        list4.add("banana");
        list4.add("orange");

        List<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "apple", "banana", "orange");
        List<String> list6 = Stream.of("apple", "banana", "orange").collect(Collectors.toList());//Java 8 later
        List<Integer> listOfList = List.of(2, 40, 50, 60, 78, 79, 77, 65);// Java 9 later. It is an immutable list
        findSecondHighestInteger(numberList);
    }

    private static void findSecondHighestInteger(List<Integer> listOfList) {
        Collections.sort(listOfList);
        System.out.println(listOfList.get(listOfList.size() - 2));
    }

}
