package PROBLEM_SOLVING.PROBLEMS_USING_STREAM;

import UTILS.Address;
import UTILS.Employee;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ConvertObjectVariableToMap {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "D1","Dibyansu", 24, "dm@gmail.com", 15000.00, LocalDateTime.now());
        Employee e2 = new Employee(2, "D1","Shruti", 29, "shr@gmail.com", 14000.00, LocalDateTime.now());
        Employee e3 = new Employee(3, "D2","MK", 25, "mk@gmail.com", 13000.00, LocalDateTime.now());
        Employee e4 = new Employee(4, "D2","Bala", 26, "bala@gmail.com", 12000.00, LocalDateTime.now());
        Employee e5 = new Employee(5, "D3","John", 45, "john@email.com", 11000.00, LocalDateTime.now());
        Employee e6 = new Employee(6, "D3","JohnDuplicate", 45, "john@email.com", 11000.00, LocalDateTime.now());

        Address a1 = new Address(1, 1, "Street1", "City1", "state1", 754101);
        Address a2 = new Address(1, 2, "Street2", "City2", "state2", 754102);
        Address a3 = new Address(1, 3, "Street3", "City3", "state3", 754103);
        Address a4 = new Address(1, 4, "Street4", "City4", "state4", 754104);
        Address a5 = new Address(1, 5, "Street5", "City5", "state5", 754105);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);
        List<Address> addresses = Arrays.asList(a1, a2, a3, a4, a5);

        mergeEmployeeAndAddresses(employees, addresses, true);
        System.out.println();
        findEmployeeWithNHighestSalary(employees, 2);
        System.out.println();
        groupEmployeesWithIdAndName(employees);// Return a map ID and Name as key value
        System.out.println();
        groupEmployeesWithGmailType(employees);


    }

    private static void groupEmployeesWithGmailType(List<Employee> employees) {
        // Group employees whose email contains "gmail"
        Map<Boolean, List<Employee>> groupedByEmail = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.geteMail().contains("gmail")));
        System.out.println("Employees with 'gmail' in email:");
        groupedByEmail.get(true).forEach(System.out::println);
        System.out.println("\nEmployees without 'gmail' in email:");
        groupedByEmail.get(false).forEach(System.out::println);
    }


    private static void groupEmployeesWithIdAndName(List<Employee> employees) {
        Map<Long, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(i-> i.getEmpId(), i->i.getName()));// Nothing but without method reference
//                .collect(Collectors.toMap(Employee::getEmpId, Employee::getName));
        System.out.println(employeeMap.getClass().getSimpleName() + " Class printing ");
        employeeMap.forEach((k, v) -> System.out.println("ID: " + k + " and Name: " + v));
    }

    private static void findEmployeeWithNHighestSalary(List<Employee> employees, int i) {
        Optional<Employee> empWithSecondHighestSal = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(i).findFirst();
        empWithSecondHighestSal.ifPresent(System.out::println);

    }

    private static void mergeEmployeeAndAddresses(List<Employee> employees, List<Address> addresses, boolean validationAdd) {
        if (validationAdd) {
            employees.forEach(employee -> {
                // Find the address where the employeeId matches
                Optional<Address> matchingAddress = addresses.stream().filter(address -> address.getEmpID() == employee.getEmpId()).findFirst();
                // Set the matching address for the employee
                matchingAddress.ifPresent(employee::setAddress);
            });
        } else {
            employees.forEach(e -> {
                e.setAddress(addresses.stream().filter(a -> a.getEmpID() == e.getEmpId()).findFirst().get());
            });
        }
// Print each employee with their corresponding address
        employees.forEach(System.out::println);
    }
}

