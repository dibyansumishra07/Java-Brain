package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentHasMultipleStudents {
    public static void main(String[] args) {
        // Sample data for students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alice", List.of(1, 2)));
        studentList.add(new Student(2, "Bob", List.of(1)));
        studentList.add(new Student(3, "Charlie", List.of(2)));
        studentList.add(new Student(4, "David", List.of(1)));
        studentList.add(new Student(5, "Eve", List.of(3)));

        // Sample data for departments
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1, "Computer Science"));
        departmentList.add(new Department(2, "Electrical Engineering"));
        departmentList.add(new Department(3, "Mechanical Engineering"));

        // Map to track department ID and the number of students
        Map<Integer, Integer> departments = new HashMap<>();

        // Count the number of students in each department
        for (Department department : departmentList) {
            for (Student student : studentList) {
                if (student.deptIds.contains(department.departmentId)) {
                    departments.put(department.departmentId, departments.getOrDefault(department.departmentId, 0) + 1);
                }
            }
        }

        // Print departments with at least 2 students
        System.out.println("Departments with at least two students:");
        for (Map.Entry<Integer, Integer> entry : departments.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println("Department ID: " + entry.getKey() + ", Number of students: " + entry.getValue());
            }
        }
        System.out.println("--== USING STREAM APPROACH ==--");
        // Count the number of students in each department using streams
        Map<Integer, Long> departmentsWithCount = departmentList.stream()
                .collect(Collectors.toMap(
                        department -> department.departmentId,
                        department -> studentList.stream()
                                .filter(student -> student.deptIds.contains(department.departmentId))
                                .count()
                ));

        // Print departments with at least 2 students
        System.out.println("Departments with at least two students:");
        departmentsWithCount.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .forEach(entry -> System.out.println("Department ID: " + entry.getKey() + ", Number of students: " + entry.getValue()));

        // ! Finding department name who has more than 2 students
        System.out.println("--== Find Department Names ==--");
        List<String> departmentsWithMoreThanTwoStudents = departmentList.stream()
                .filter(department -> studentList.stream()
                        .filter(student -> student.deptIds.contains(department.departmentId))
                        .count() > 2)
                .map(department -> department.deptName)
                .toList();

        // Print departments with more than 2 students
        System.out.println("Departments with more than two students:");
        departmentsWithMoreThanTwoStudents.forEach(System.out::print);

        // ! Trying flatmap
        System.out.println("\nFLATMAP =><=");
        Map<Integer, Long> deptIdAndStudentCount = studentList.stream()
                .flatMap(student -> student.deptIds.stream())// Flatten the department ids
                .collect(Collectors.groupingBy(
                        dept -> dept,
                        Collectors.counting()
                ));
        deptIdAndStudentCount.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .forEach(entry -> System.out.println("Department ID: " + entry.getKey() + ", Number of students: " + entry.getValue()));

    }
}

class Student {
    Integer id;
    String name;
    List<Integer> deptIds;

    Student(Integer id, String name, List<Integer> deptIds) {
        this.id = id;
        this.name = name;
        this.deptIds = deptIds;
    }
}

class Department {
    Integer departmentId;
    String deptName;

    Department(Integer departmentId, String deptName) {
        this.departmentId = departmentId;
        this.deptName = deptName;
    }
}
