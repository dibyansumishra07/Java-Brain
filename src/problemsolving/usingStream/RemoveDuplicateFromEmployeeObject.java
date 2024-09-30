package problemsolving.usingStream;

import java.util.*;

class Employee1 {
    String name;
    int age;
    String color;
    String city;
    String gender;

    // Constructor, getters, and setters
    public Employee1(String name, int age, String color, String city, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.city = city;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee = (Employee1) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(color, employee.color) &&
                Objects.equals(city, employee.city) &&
                Objects.equals(gender, employee.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, city, gender);
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + color + ", " + city + ", " + gender + ")";
    }
}

public class RemoveDuplicateFromEmployeeObject {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("John", 25, "White", "New York", "Male"),
                new Employee1("Jane", 22, "Brown", "New York", "Female"),
                new Employee1("Doe", 30, "Black", "Los Angeles", "Male"),
                new Employee1("John", 25, "White", "New York", "Male"), // Exact duplicate
                new Employee1("Jane", 22, "Brown", "New York", "Female") // Exact duplicate
        );

        // Remove duplicates
        List<Employee1> uniqueEmployees = new ArrayList<>(new HashSet<>(employees));

        // Print the unique employees
        uniqueEmployees.forEach(System.out::println);
    }
}
