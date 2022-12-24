package polyankina_kvbo0821.prac6.hw6_6_7_8_9;

public class Book implements Printable {

    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void print() {
        System.out.println("Title (book): " + getBookTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
