package utils;

import java.time.LocalDateTime;
import java.util.Objects;

public class Employee {
    private long empId;
    private String name;
    private int age;
    private String eMail;
    private double salary;
    private LocalDateTime hireDate;
    private Address address;

    public Employee(long empId, String name, int age, String eMail, double salary, LocalDateTime hireDate) {
        this.empId = empId;
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
                ", name='" + name + '\'' +
                ", age=" + age +
                ", eMail='" + eMail + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", address=" + address +
                '}';
    }
}
