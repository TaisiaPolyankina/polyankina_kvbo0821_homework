package polyankina_kvbo0821.prac2.hw2_ex8;
// part 2 ex 8
import java.util.ArrayList;
import java.util.Scanner;

public class changeElemStringArrayBackwards {

    static ArrayList <String> s = new ArrayList<>();
    static Scanner source = new Scanner(System.in);
    static String line = "";

    static public void showHelp() {
        String info = "Список доступных комманд:\n" + "help >> вывод списка доступных комманд\n" +
                "info >> вывод элементов массива строк\n" + "add >> добавоение нового элемента в массив\n" +
                "sort >> сортировка элементов массива в обратном порядке\n" + "stop >> завершение работы программы";
        System.out.println(info);
    }

    static public void showInfo() {
        System.out.println("Элементы массива строк: ");
        for (int i = 0; i < s.size(); i ++) {
            System.out.println(s.get(i));
        }
    }

    static public void addElem() {
        System.out.println("Введите строку: ");
        String elem = source.nextLine();
        s.add(elem);
    }

    static public void sortBackwards() {
        int size = 0;
        if (s.size() % 2 == 1) {
            size = (s.size() - 1) / 2;
        }
        else {
            size = s.size() / 2;
        }
        for (int i = 0; i < size; i ++) {
            String line1 = s.get(i);
            String line2 = s.get(s.size() - 1 - i);
            s.set(i, line2);
            s.set(s.size() - 1 - i, line1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Начало работы программы.");
        showHelp();
        while(!line.equals("stop")) {
            System.out.println("Что вы намерены делать дальше?");
            line = source.nextLine();
            switch(line) {
                case("help"):
                    showHelp();
                    break;
                case("info"):
                    showInfo();
                    break;
                case("add"):
                    addElem();
                    System.out.println("Новый элемент успешно добавлен в массив");
                    break;
                case("sort"):
                    sortBackwards();
                    System.out.println("Массив успешно отсортирован");
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
