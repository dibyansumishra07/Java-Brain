package ADVANCE_JAVA.STREAM_LAMBDA.streamWithComplexObjects;

import java.util.*;
import java.util.stream.Collectors;

public class SalesMan {
    List<Product> products;

    public SalesMan(List<Product> products) {
        this.products = products;
    }

    public static void main(String[] args) {

        Product product1 = new Product(12);
        Product product2 = new Product(40);
        Product product3 = new Product(41);
        Product product4 = new Product(42);
        Product product5 = new Product(1);
        SalesMan salesMan1 = new SalesMan(List.of(product1,product5));
        SalesMan salesMan2 = new SalesMan(List.of(product1,product2,product3,product4,product5));
        SalesMan salesMan3 = new SalesMan(List.of(product1,product2,product3,product4,product5));
        List<SalesMan> salesManList = List.of(salesMan1,salesMan2, salesMan3);
        var filteredSalesManList = salesManList.stream().filter(salesman->salesman.getProducts().stream().anyMatch(product -> product.getPrice()>40)).toList();
        Map<SalesMan, Long> salesManWithProductCount = salesManList.stream()
                .collect(Collectors.toMap(
                        salesman -> salesman,
                        salesman -> salesman.getProducts().stream()
                                .filter(product -> product.getPrice() > 40)
                                .count()
                ));
//        System.out.println(filteredSalesManList.size());
        System.out.println(salesManWithProductCount);

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "products=" + products +
                '}';
    }
}
