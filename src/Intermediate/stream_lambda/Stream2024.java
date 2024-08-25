package Intermediate.stream_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2024 {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(2, 40, 50, 60, 78, 79, 77, 65);
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        dataManipulateUsingStream(list2, names);
    }

    //TODO: Stream Filter methods
    private static void streamFilterFunction(List<Integer> list) {
        List<Integer> oddNumbers = list.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("oddNumbers: " + oddNumbers);
        System.out.println("evenNumbers: " + evenNumbers);
    }

    //TODO: Stream sorting methods
    private static void streamSortingMethods(List<Integer> list) {
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println("Sorted List Default or Ascending Order: " + sortedList);

        List<Integer> sortedListDescending = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted List in Descending Order: " + sortedListDescending);

        int highestNumber = list.stream().sorted().toList().get(list.size() - 1);
        int secondHighestNumber = list.stream().sorted().toList().get(list.size() - 2);
        int secondHighestNumberUsingDescendSort = list.stream().sorted((a, b) -> b - a).toList().get(1);
        System.out.println(highestNumber + " " + secondHighestNumber + " " + secondHighestNumberUsingDescendSort);
    }

    //TODO: Stream Data Manipulation methods
    private static void dataManipulateUsingStream(List<Integer> list, List<String> names) {
        // Find multiply of 2 of all elements
        List<Integer> newList = list.stream().map(n -> n * 2).toList();
        // Find Sum of all odd numbers
        System.out.println("Sum of stream using IntStream or MapToInt: "+list.stream().filter(i -> i % 2 != 0).mapToInt(i -> i).sum());
        System.out.println("Sum of stream using IntStream or MapToInt: "+list.stream().mapToInt(i->i).sum());
        System.out.println("Sum of stream using reduce: "+list.stream().reduce(0, Integer::sum));
        // Make all strings in a list to upper case or lower case
        System.out.println("Names in upper case: " + names.stream().map(String::toUpperCase).toList());
        System.out.println("Distinct numbers: " + list.stream().distinct().toList());
        // The below snippet remove elements from end of stream and give us rest as per number provided
        System.out.println("Reduce or limit the list to size of 3: " + list.stream().limit(3).toList());
        // The below snippet remove elements from the beginning of stream and give us rest as per number provided
        System.out.println("Reduce or limit the list to size of 3: " + list.stream().skip(2).toList());
        // Checking how many even elements in the stream
        System.out.println("Total Even number in the list is : " + list.stream().filter(i->i%2==0).count());
        // TODO: Data Findings
        System.out.println("Maximum number of elements: " + list.stream().max(Integer::compareTo).get());
        System.out.println("Minimum number of elements: " + list.stream().min(Integer::compareTo).get());
    }
    // Data Checks
    private static void dataCheckUsingStream(List<Integer> list){
        // Check if all elements in the list are even
        boolean allEven = list.stream().allMatch(i -> i % 2 == 0);
        System.out.println("All elements in the list are even: " + allEven);

        // Check if any element in the list is even
        boolean anyEven = list.stream().anyMatch(i -> i % 2 == 0);
        System.out.println("Any element in the list is even: " + anyEven);

        // Check if none of the elements in the list is even
        boolean noneEven = list.stream().noneMatch(i -> i % 2 == 0);
        System.out.println("None of the elements in the list is even: " + noneEven);
    }

    //TODO: Stream Parallel and sequential processing
    private static void exploreDifferentStreamMethods() {
        List<String> names = Arrays.asList("Aman", "Dibyansu", "Mayank", "Bala", "Raghu");
        // filter(Predicate): (predicate: boolean valued function)
        names.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList()).forEach(i -> System.out.println(i));

        // map(function): We can perform operation on each element
        List<Integer> list2 = Arrays.asList(2, 40, 50, 60, 78, 79, 77, 65);
        list2.stream().map(i -> i * 2).collect(Collectors.toList()).forEach(i -> System.out.println(i));

        // sort:
        list2.stream().sorted().forEach(System.out::println);

        // max min
        Integer min = list2.stream().min((x, y) -> x.compareTo(y)).get();
        Integer max = list2.stream().max((x, y) -> x.compareTo(y)).get();

    }

    private static void conceptOfFlatMap() {
        List<List<String>> namesNested = Arrays.asList(Arrays.asList("John", "Jane"), Arrays.asList("Jack", "Jill"));
        List<String> namesFlat = namesNested.stream().flatMap(List::stream).toList();
    }

    private static void createStreams() {
        //1 Blank Stream
        Stream<Object> emptyStream = Stream.empty();
        //2 Converting array into stream
        String[] names = {"Dibyansu", "Mayank", "Bala", "Raghu"};
        Stream<String> nameStream = Stream.of(names);
        //3 Stream using builder function
        Stream<Object> build = Stream.builder().build();
        // 4 Int stream
        IntStream stream = Arrays.stream(new int[]{1, 2, 3});
        //5 Collection list, set
        List<Integer> list2 = Arrays.asList(2, 40, 50, 60, 78, 79, 77, 65);
        list2.stream().forEach(i -> System.out.println(i));
    }

}
