package polyankina_kvbo0821.prac2.hw2_ex7;
// part 2 ex 7
import polyankina_kvbo0821.prac2.hw2_ex7.BookShelf;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        Scanner source = new Scanner(System.in);
        String line = "";
        BookShelf bs = new BookShelf();

        while (!line.equals("stop")) {
            System.out.println("Что вы намерены делать дальше?");
            line = source.nextLine();
            switch(line) {
                case("add"):
                    bs.addBook();
                    break;
                case("showOldest"):
                    bs.sortBooks();
                    System.out.println(bs.findOldest());
                    break;
                case("showNewest"):
                    bs.sortBooks();
                    System.out.println(bs.findNewest());
                    break;
                case("help"):
                    System.out.println(bs.help());
                    break;
                case("info"):
                    System.out.println(bs.toString());
                    break;
                case("sort"):
                    bs.sortBooks();
                    System.out.println("Книги были успешно отсортированы по году.");
                    break;
                default:
                    if (!line.equals("stop")) {
                        System.out.println("Комманда введена неверно. Попробуйте ещё раз. Для справки введите help.");
                    }
            }
        }
        System.out.println("Работа программы завершена");
    }
}
