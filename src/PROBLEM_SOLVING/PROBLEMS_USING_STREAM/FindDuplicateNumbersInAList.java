package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumbersInAList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 5);
        numbers.forEach(i -> {
            if (Collections.frequency(numbers, i) > 1) {
                System.out.println("Collection Frequency"+i);
            }
        });
        numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> {
                    if (v > 1)
                        System.out.println(k);
                });

    }
}
