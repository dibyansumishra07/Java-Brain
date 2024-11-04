package ADVANCE_JAVA.COMPARABLE_COMPARATOR;

import java.util.*;

public class NullSafeComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee(null, 7000),
                new Employee("Charlie", 4000)
        );

        // Sorting by name, putting null names first
        employees.sort(Comparator.comparing(Employee::getName, Comparator.nullsFirst(Comparator.naturalOrder())));

        employees.forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

