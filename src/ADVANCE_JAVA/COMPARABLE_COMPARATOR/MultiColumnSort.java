package ADVANCE_JAVA.COMPARABLE_COMPARATOR;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
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
}

public class MultiColumnSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("John", 20));

        // Sort first by age, then by name
        people.sort(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getName));

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
