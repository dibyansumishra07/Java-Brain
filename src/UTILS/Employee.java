package UTILS;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Employee {
    private long empId;
    private String departmentId;
    private String name;
    private int age;
    private String eMail;
    private double salary;
    private LocalDateTime hireDate;
    private Address address;

    public Employee(long empId, String departmentId, String name, int age, String eMail, double salary, LocalDateTime hireDate) {
        this.empId = empId;
        this.departmentId = departmentId;
        this.name = name;
        this.age = age;
        this.eMail = eMail;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static List<Employee> getEmployees(int n) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            // Generating Random Salary using random class
            double salary = 50000.0 + (new Random().nextDouble() * (100.0 - 50.0));
            salary = Double.parseDouble(new DecimalFormat("0.00").format(salary));

            // Get the fractional part of the salary
            double fractionalPart = salary - (long)salary;
            // Multiply by 100 (or any higher power of 10 for more precision) to get integer-like valuė
            int age = (int)(fractionalPart * 100); // For two decimal places
            Employee e = new Employee(i, "D1", "John" + i, age, "Mail" + i, salary, LocalDateTime.now());
            employees.add(e);
        }
        return employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(empId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", eMail='" + eMail + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", address=" + address +
                '}';
    }
}
