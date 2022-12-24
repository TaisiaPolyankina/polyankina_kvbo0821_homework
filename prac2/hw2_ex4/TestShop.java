package polyankina_kvbo0821.prac2.hw2_ex4;

import polyankina_kvbo0821.prac2.hw2_ex4.Shop;

import java.lang.*;
import java.util.Scanner;

public class TestShop {
    public static void help() {
        System.out.println("Список доступных команд: " + "\n" +
                "help >> вывести справку" + "\n" +
                "add >> добавить новый компьютер в магазин" + "\n" +
                "delete >> убрать компьютер из магазина" + "\n" +
                "search >> начать поиск нужного компьютера" + "\n" +
                "info >> показать информацию о компьютерах в магазие" + "\n" +
                "stop >> завершить работу программы");
    }

    public static void main(String[] args) {

        String model;
        int year;
        int cost;
        int RAM;
        int memory;

        String line = "";
        String request;
        int counter = 0;
        int num;

        Scanner source = new Scanner(System.in);
        Shop s = new Shop();

        System.out.println("Начало работы программы. Списко команд: " + "\n" +
                "help >> вывести справку" + "\n" +
                "add >> добавить новый компьютер в магазин" + "\n" +
                "delete >> убрать компьютер из магазина" + "\n" +
                "search >> начать поиск нужного компьютера" + "\n" +
                "info >> показать информацию о компьютерах в магазие" + "\n" +
                "stop >> завершить работу программы");
        while (true) {
            System.out.println("Что вы намерены сделать дальше?");
            line = source.nextLine();

            if (line.equals("help")) {
                help();

                System.out.println("Что вы намерены делать дальше?");
                line = source.nextLine();
            }

            if (line.equals("add")) {
                System.out.println("Введите характеристики нового пк: model, year, cost, RAM, memory");
                model = source.nextLine();
                year = source.nextInt();
                cost = source.nextInt();
                RAM = source.nextInt();
                memory = source.nextInt();
                s.addPc(model, year, cost, RAM, memory);
                counter += 1;
                String mess = String.format("Новый пк успешно добавлен. Текущее количество пк: %s", counter);
                System.out.println(mess);
            }

            if (line.equals("delete")) {
                System.out.println("Введите номер пк, который вы желаете удалить " +
                        "(нумерация осуществляется, начиная с 1): ");
                num = source.nextInt();
                s.deletePc(num);
                counter -= 1;
                String mess = String.format("Пк номер %s был успешно удалён. Текущее количество пк: %s", num, counter);
                System.out.println(mess);
            }

            if (line.equals("search")) {
                System.out.println("По какому параметру вы хотите отыскать пк? (model/year/cost/RAM/memory/number)");
                request = source.nextLine();
                s.searchPc(request, counter);
            }

            if (line.equals("info")) {
                System.out.println("Текущая информация о компьютерах в магазине: " + "\n" + s.toString());
            }

            if (line.equals("stop")) {
                break;
            }

            else {
                System.out.println("Команда введена неверно. Попробуйте ещё раз.");
            }
        }

        System.out.println("Работа программы завершена.");
    }
}
