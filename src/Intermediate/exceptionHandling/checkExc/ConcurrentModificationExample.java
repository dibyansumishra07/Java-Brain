package Intermediate.exceptionHandling.checkExc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Concurrent modification while iterating
        throwConcurrentModificationException(numbers);

        //Solution to avoid ConcurrentModificationException
        avoidConcurrentModificationException(numbers);

        // Print the modified list
        System.out.println(numbers); // Output: [1, 3]
    }

    private static void avoidConcurrentModificationException(List<Integer> numbers)  {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 2) {
                // Use Iterator's remove method to modify the list safely
                iterator.remove(); // This will not throw ConcurrentModificationException
            }
        }
    }

    private static void throwConcurrentModificationException(List<Integer> numbers) {
        for(int i : numbers){
            if (i == 2) {
                numbers.remove(i);// This will throw ConcurrentModificationException
            }
        }
    }
}

