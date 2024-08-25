package BackToBasics.ComparableComparator;

public class Student implements Comparable<Student> {
    private String name;
    private int id;

    // Constructor, getters, setters

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
