package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Set;

import UTILS.Employee;

import java.time.LocalDateTime;
import java.util.HashSet;

public class SetConcept {
    public static void main(String[] args) {
        conceptHashSet();
    }

    private static void conceptHashSet() {
        System.out.println("-------------------------------Concept Started---------------------------------");
        System.out.println("Two unique employees and hashset of employee created and employees has been added to the set.");
        Employee e1 = new Employee(1,"D1", "Dibyansu", 25, "dib@gmail.com", 1000.00, LocalDateTime.now());
        Employee e2 = new Employee(2,"D2","Shruti", 24, "shruti@gmail.com", 2000.00, LocalDateTime.now());

        HashSet<Employee> employeeHashSet = new HashSet<Employee>();
        employeeHashSet.add(e1);
        employeeHashSet.add(e2);
//        employeeHashSet.add(null); // Null allowed only 1
        employeeHashSet.forEach(e -> System.out.println("Printing set objects: "+e.getEmpId() +" "+ e.getName()));
        System.out.println("Changing empId of E2 to 1 now both the objects are same.");
        e2.setEmpId(1);
        employeeHashSet.forEach(e -> System.out.println("Printing set objects: "+e.getEmpId() +" "+ e.getName()));


        System.out.println("-------------------------------Concept Ended---------------------------------");
    }
}
