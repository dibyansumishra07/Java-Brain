package ADVANCE_JAVA.STREAM_LAMBDA;

import UTILS.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
public class FlatMapConcept2024 {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees(10);
        List<List<Integer>> nums = List.of(List.of(1,2,3,3,4,5),List.of(1,2,3,3,4,5),List.of(1,2,3,3,4,5));

        // Example usage
        List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList("Reading", "Gaming")),
                new Person("Bob", Arrays.asList("Cooking", "Cycling")),
                new Person("Charlie", Arrays.asList("Hiking", "Running"))
        );

        collectHobbiesOfEmployees(people);
        convertAllNumbersIntoSingleStream(nums);

    }

    private static void collectHobbiesOfEmployees(List<Person> people) {
        // Using flatMap to get a flat list of hobbies
        List<String> allHobbies = people.stream()
                .flatMap(person -> person.getHobbies().stream())
                .collect(Collectors.toList());

        System.out.println(allHobbies);
    }

    private static void convertAllNumbersIntoSingleStream(List<List<Integer>> nums) {
        nums.stream().flatMap(num -> num.stream()).collect(Collectors.toList()).forEach(System.out::print);
    }
}
