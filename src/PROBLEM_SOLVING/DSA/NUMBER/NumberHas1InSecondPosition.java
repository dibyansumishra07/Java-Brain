package PROBLEM_SOLVING.DSA.NUMBER;

import java.util.List;

public class NumberHas1InSecondPosition {
    public static void main(String[] args) {
        List<Integer> nums = List.of(11, 22, 33, 111, 112, 112, 1, 1114455, 1111, 1122);
        nums.stream().filter(i -> checkIfNumberHas1InSecondPosition(i)).forEach(System.out::println);
    }

    private static boolean checkIfNumberHas1InSecondPosition(int number) {
        // Remove all but the tens and hundreds place by dividing by 10, then check the remainder
        if (number > 999) {
            while (number > 0) {
                number = (number / 10);
                if (number > 100 && number < 999) {
                    return number % 10 == 1;
                }
            }
        } else if (number > 100 && number < 992) {
            return number % 10 == 1;
        }
        return false;
    }
}
