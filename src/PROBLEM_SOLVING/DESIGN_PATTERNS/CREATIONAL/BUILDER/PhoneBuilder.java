package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.BUILDER;

public class PhoneBuilder {
    private String brand;
    private String OS;
    private int ramSize;
    private int battery;
    private double size;



    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRamSize(int ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setSize(double size) {
        this.size = size;
        return this;
    }
    
    public Phone build() {
        return new Phone(brand, OS, ramSize, battery, size);
    }
}
