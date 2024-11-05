package ADVANCE_JAVA.STREAM_LAMBDA.streamWithComplexObjects;

public class Product {
    int price;

    public Product(int productPrice) {
        this.price = productPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}
