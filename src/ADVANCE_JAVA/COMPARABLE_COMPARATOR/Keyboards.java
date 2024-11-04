package ADVANCE_JAVA.COMPARABLE_COMPARATOR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Keyboards implements Comparable<Keyboards> {

    @Override
    public String toString() {
        return "Keyboards [brand=" + brand + ", price=" + price + ", keyType=" + keyType + "]";
    }

    private String brand;
    private double price;
    private String keyType;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public Keyboards(String brand, double price, String keyType) {
        this.brand = brand;
        this.price = price;
        this.keyType = keyType;
    }

    @Override
    public int compareTo(Keyboards keyboard) {

        if (this.getPrice() > keyboard.getPrice())
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {

        List<Keyboards> keyboards=new ArrayList<>();

        keyboards.add(new Keyboards("logitech", 3000, "blue"));
        keyboards.add(new Keyboards("redgear", 2300, "blue"));
        keyboards.add(new Keyboards("cosmicbyte", 2200, "red"));

        Collections.sort(keyboards);

        for (Keyboards keyboards2 : keyboards) {
            System.out.println(keyboards2);
        }
    }
}
