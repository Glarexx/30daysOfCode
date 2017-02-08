/**
 * @author Ievgenii Drozd
 * @version 2/8/17
 *          Day 13: Abstract Classes
 */
public class MyBook extends Book {
    int price;

    MyBook(String t, String a, int p) {
        super(t, a);
        price = p;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);

    }
}
