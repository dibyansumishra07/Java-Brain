package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateObjectUsingStreamOnly {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 25, "White", "New York", "Male"),
                new Employee("Jane", 22, "Brown", "New York", "Female"),
                new Employee("Doe", 30, "Black", "Los Angeles", "Male"),
                new Employee("John", 25, "White", "New York", "Male"), // Exact duplicate
                new Employee("Jane", 22, "Brown", "New York", "Female") // Exact duplicate
        );

        // Remove duplicates using Stream and Collectors.toMap
        Map<List<? extends Serializable>, Employee> collect = employees.stream()
                .collect(Collectors.toMap(
                        // Use a combination of attributes as the key to ensure uniqueness
                        emp -> List.of(emp.name, emp.age, emp.color, emp.city, emp.gender),
                        emp -> emp, (existing, replacement) -> existing // If a duplicate is found, keep the first one
                ));
        collect.forEach((k,v)->System.out.println(k+": Unique: "+v));
    }
}

