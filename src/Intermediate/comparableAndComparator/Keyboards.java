package Intermediate.comparableAndComparator;

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

}
