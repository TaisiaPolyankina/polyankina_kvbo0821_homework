package polyankina_kvbo0821.prac2.hw2_ex7;
// part 2 ex 7
import polyankina_kvbo0821.prac2.hw2_ex7.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookShelf {
    ArrayList<Book> bookList = new ArrayList<>();
    Scanner source = new Scanner(System.in);
    public void addBook() {
        System.out.println("Введите параметры книги: автор, название книги, жанр, язык оригинала, кол-во страниц, год издания");
        String author = source.nextLine();
        if (author.equals("")) {
            System.out.println("Можете начинать ввод");
            author = source.nextLine();
        }
        String name = source.nextLine();
        String genre = source.nextLine();
        String language = source.nextLine();
        int pages = source.nextInt();
        int year = source.nextInt();
        bookList.add(new Book(author, name, genre, language, pages, year));
    }

    public String findOldest() {
        return bookList.get(0).getName();
    }

    public String findNewest() {
        return bookList.get(bookList.size() - 1).getName();
    }

    public void sortBooks() {
        for (int i = 0; i < bookList.size(); i ++) {
            for (int j = 0; j < bookList.size() - 1 - i; j ++) {
                if (bookList.get(j).getYear() > bookList.get(j + 1).getYear()) {
                    Book b1 = bookList.get(j);
                    Book b2 = bookList.get(j + 1);
                    bookList.set(j, b2);
                    bookList.set(j + 1, b1);
                }
            }
        }
    }

    public String help() {
        return ("Список доступных команд\n" + "add >> добавить книгу\n" + "showOldest >> показать книгу с самым поздним"
        + " годом издания\n" + "showNewest >> показать книгу с самым ранним годом издания\n" + "info >>"
        + " показать справку\n" + "sort >> сортирует книги по году издания\n" + "stop >> остановить работу программы");
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < bookList.size(); i++) {
            Book b = bookList.get(i);
            s = s + b.toString() + "\n";
        }
        s = s + "Количество книг: " + bookList.size();
        return s;
    }
}
