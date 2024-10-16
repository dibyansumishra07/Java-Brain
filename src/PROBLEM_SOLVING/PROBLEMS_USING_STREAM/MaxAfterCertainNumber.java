package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.Arrays;
import java.util.List;

public class MaxAfterCertainNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
        int certainNumber = 30;
        Integer maxAfterCertain = getMaxAfterCertainNumber(numbers, certainNumber);

        if (maxAfterCertain != null) {
            System.out.println("Maximum number after " + certainNumber + " is: " + maxAfterCertain);
        } else {
            System.out.println("No number found after " + certainNumber);
        }
    }

    public static Integer getMaxAfterCertainNumber(List<Integer> numbers, int certainNumber) {
        int index = numbers.indexOf(certainNumber);

        if (index == -1 || index == numbers.size() - 1) {
            return null;  // Either certainNumber is not in the list or it's the last element.
        }

        // Get the sublist after the certainNumber
        List<Integer> subList = numbers.subList(index + 1, numbers.size());

        // Find the maximum in the sublist
        return subList.stream().max(Integer::compare).orElse(null);
    }
}
