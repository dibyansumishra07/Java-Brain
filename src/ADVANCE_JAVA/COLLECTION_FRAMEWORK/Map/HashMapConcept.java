package ADVANCE_JAVA.COLLECTION_FRAMEWORK.Map;

import UTILS.Employee;

import java.time.LocalDateTime;
import java.util.HashMap;

public class HashMapConcept {
    public static void main(String[] args) {

        learnHashMapWithStringKey();
        learnHashMapWithObject();
    }

    private static void learnHashMapWithStringKey() {
        System.out.println("----------------------Concept Starts --------------------");
        HashMap<String,String> stringHashMap = new HashMap<>();
        System.out.println("Creating two string objects s1 and s2");
        String s1 = "S1";
        String s2 = "S2";
        System.out.println("Putting two string objects s1 and s2 in hashmap");
        stringHashMap.put(s1, "S1Value");
        stringHashMap.put(s2, "S2Value");
        System.out.println("Map size after adding s1 and s2: "+stringHashMap.size());
        System.out.println("Map content after adding s1 and s2: "+stringHashMap);
        System.out.println("Changing S2 value similar to S1 and making it duplicate: ");
        s2 = "S1";
        System.out.println("Map size after making s1 and s2 similar: "+stringHashMap.size());
        System.out.println("Map content after making s1 and s2 similar: "+stringHashMap);
        System.out.println("Getting s1 key: "+stringHashMap.get(s1));
        System.out.println("Getting s1 key: "+stringHashMap.get(s2));
        System.out.println("----------------------Concept Ends --------------------");


    }

    private static void learnHashMapWithObject() {
        System.out.println("----------------------Concept starts --------------------");
        System.out.println("Creating two unique employee objects E1 and E2 where hashcode and equals overridden with empID");
        Employee e1 = new Employee(1,"D1","Dibyansu", 25, "dib@gmail.com", 1000.00, LocalDateTime.now());
        Employee e2 = new Employee(2,"D2","Shruti", 24, "shruti@gmail.com", 2000.00, LocalDateTime.now());

        System.out.println("Creating two maps hash and tree map");
        HashMap<Employee, String> hashMapWithObjectKey = new HashMap<>();
        HashMap<Employee, String> treeMapWithObjectKey = new HashMap<>();

        System.out.println("Putting E1 and E2 in hash map");
        hashMapWithObjectKey.put(e1, "Dibyansu");
        hashMapWithObjectKey.put(e2, "Shruti");

        System.out.println("Putting E1 and E2 in tree map");
        treeMapWithObjectKey.put(e1, "Dibyansu");
        treeMapWithObjectKey.put(e2, "Shruti");

        System.out.println("E1 hashcode: "+e1.hashCode());
        System.out.println("E2 hashcode: "+e2.hashCode());

        System.out.println("Setting E2 employee ID to 1 which is now a duplicate of E1 also changing the name");
        e2.setEmpId(1);
        e2.setName("Shruti Modifed");

        System.out.println("As now emp id is same for E1 and E2. Checking the hashcode, map sizes if it is same.");
        System.out.println("E1 hashcode: "+e1.hashCode());
        System.out.println("E2 hashcode: "+e2.hashCode());
        System.out.println("hashMapWithObjectKey size: "+hashMapWithObjectKey.size());
        System.out.println("treeMapWithObjectKey size: "+treeMapWithObjectKey.size());
        System.out.println("--------------------Getting map values with key----------------");
        System.out.println("Getting with E1: "+hashMapWithObjectKey.get(e1));
        System.out.println("Getting with E2: "+hashMapWithObjectKey.get(e2));
        System.out.println("Getting with E1: "+treeMapWithObjectKey.get(e1));
        System.out.println("Getting with E2: "+treeMapWithObjectKey.get(e2));

        System.out.println("Again correcting empid of E2 and making it unique. And getting values with key");
        e2.setEmpId(2);
        System.out.println("Getting with E1: "+hashMapWithObjectKey.get(e1));
        System.out.println("Getting with E2: "+hashMapWithObjectKey.get(e2));
        System.out.println("Getting with E1: "+treeMapWithObjectKey.get(e1));
        System.out.println("Getting with E2: "+treeMapWithObjectKey.get(e2));

        hashMapWithObjectKey.forEach((k,v) -> System.out.println("Emp Id in map: "+k.getEmpId()+k.getName()));
        hashMapWithObjectKey.entrySet().forEach(e -> System.out.println("Hashcode of object in map: "+e.hashCode()));

        treeMapWithObjectKey.forEach((k,v) -> System.out.println("Emp Id in map: "+k.getEmpId()+k.getName()));
        treeMapWithObjectKey.entrySet().forEach(e -> System.out.println("Hashcode of object in map: "+e.hashCode()));
        System.out.println("----------------------Concept Ends --------------------");
    }
}
