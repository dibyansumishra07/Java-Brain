package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;
    String color;
    String city;
    String gender;

    // Constructor, getters, and setters
    public Employee(String name, int age, String color, String city, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.city = city;
        this.gender = gender;
    }

    // Getters
    public String getCity() { return city; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + city + ")";
    }
}

public class GroupByUsingStreamOnEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 25, "White", "New York", "Male"),
                new Employee("Jane", 22, "Brown", "New York", "Female"),
                new Employee("Doe", 30, "Black", "Los Angeles", "Male"),
                new Employee("Alice", 29, "Blonde", "Los Angeles", "Female"),
                new Employee("Bob", 35, "White", "New York", "Male")
        );

        // Group by city, then group by gender and count population in each group
        Map<String, Map<String, Long>> genderCountByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.groupingBy(Employee::getGender,
                                Collectors.counting())));

        // Print the results
        genderCountByCity.forEach((city, genderMap) -> {
            System.out.println("-> City: " + city);
            genderMap.forEach((gender, count) -> System.out.println("       "+gender + ": " + count));
        });
    }
}

