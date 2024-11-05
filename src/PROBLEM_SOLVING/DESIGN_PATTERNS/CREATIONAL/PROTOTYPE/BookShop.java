package PROBLEM_SOLVING.DESIGN_PATTERNS.CREATIONAL.PROTOTYPE;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> bookList = new ArrayList<>();

    public void loadBook(){
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setBookId(i);
            book.setBookTitle("Book"+i);
            bookList.add(book);
        }
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    public BookShop clone() {
        BookShop bookShop = new BookShop();
        for (Book book : this.getBookList()) {
            bookShop.getBookList().add(book);
        }
        return bookShop;
    }
}
