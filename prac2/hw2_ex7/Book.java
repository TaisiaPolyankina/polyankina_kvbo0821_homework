package polyankina_kvbo0821.prac2.hw2_ex7;
// part 2 ex 7
public class Book {
    private String author;
    private String name;
    private String genre;
    private String language;
    private int pages;
    private int year;
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    public Book(String author, String name, String genre, String language, int pages, int year) {
        this.author = author;
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
