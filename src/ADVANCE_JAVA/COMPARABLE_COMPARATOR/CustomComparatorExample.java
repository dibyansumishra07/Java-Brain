package ADVANCE_JAVA.COMPARABLE_COMPARATOR;

import java.util.*;

public class CustomComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 7000),
                new Employee("Charlie", 4000)
        );

        // Sorting based on custom logic: Sort by salary first, then by name length
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int salaryComparison = Integer.compare(e1.getSalary(), e2.getSalary());
                if (salaryComparison == 0) {
                    return Integer.compare(e1.getName().length(), e2.getName().length());
                }
                return salaryComparison;
            }
        });

        employees.forEach(System.out::println);
    }
}

