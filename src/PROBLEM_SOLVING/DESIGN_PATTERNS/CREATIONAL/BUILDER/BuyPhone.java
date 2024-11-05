package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.BUILDER;

public class BuyPhone {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setBrand("iPhone")
                .setOS("IOS")
                .setBattery(3000)
                .setRamSize(8)
                .build();
        System.out.println("Phone Purchased: "+phone);
    }
}
