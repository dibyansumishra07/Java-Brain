package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.PROTOTYPE;

public class PrototypeDemo {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("bookShop1");
        bookShop.loadBook();

        BookShop bookShop2 = bookShop.clone();
        bookShop.getBookList().remove(1);
        bookShop2.setShopName("bookShop2");

        System.out.println(bookShop);
        System.out.println(bookShop2);
    }
}
