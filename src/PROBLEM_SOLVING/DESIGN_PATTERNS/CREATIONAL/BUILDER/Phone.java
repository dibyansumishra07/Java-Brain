package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.BUILDER;

public class Phone {
    private String brand;
    private String OS;
    private int ramSize;
    private int battery;
    private double size;

    public Phone(String brand, String OS, int ramSize, int battery, double size) {
        this.brand = brand;
        this.OS = OS;
        this.ramSize = ramSize;
        this.battery = battery;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", ramSize=" + ramSize +
                ", battery=" + battery +
                ", size=" + size +
                '}';
    }
}
