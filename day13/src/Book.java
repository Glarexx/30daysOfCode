/**
 * @author Ievgenii Drozd
 * @version 2/8/17
 */

abstract class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();


}
