package polyankina_kvbo0821.prac2.hw2_ex5;

import polyankina_kvbo0821.prac2.hw2_ex5.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDogKennel {
    static ArrayList<Dog> dogList = new ArrayList<>();
    public void addDogs(int amount, String name, int age) {
        for (int i = 0; i < amount; i++) {
            dogList.add(new Dog(name, age));
        }
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        String line;


        System.out.println("Начало работы программы. Списко команд: " + "\n"
                + "add >> добавить некоторое количество собак" + "\n"
                + "human >> узнать возраст собаки в человеческих годах" + "\n"
                + "let >> дать собаке новый дом и семью" + "\n"
                + "info >> вывести информацию о собаках в питомнике" + "\n"
                + "stop >> завершить работу программы"
                + "help >> вывести список доступных команд");

        while (true) {
            System.out.println("Что вы намерены сделать дальше?");
            line = source.nextLine();

            if (line.equals(("add"))) {
                System.out.println("Введите кличку и возраст собаки: ");
                String name = source.nextLine();
                int age = source.nextInt();
                dogList.add(new Dog(name, age));
                String out = String.format("Новая собака успешно пристроена в приют. Теперь здесь %s собак", dogList.size());
                System.out.println(out);
            }

            if (line.equals("human")) {
                System.out.println("Введите номер собаки (начиная с 1), чей возраст вы хотите узнать в человеческих годах: ");
                int number = source.nextInt();
                Dog d = dogList.get(number - 1);
                String out = String.format("Возраст собаки %s в человеческих годах -- %s лет", d.getName(),
                        d.humanAge(d.getAge()));
                System.out.println(out);
            }

            if (line.equals("let")) {
                System.out.println("Введите номер собаки (начиная с 1), которая должна уехать в новую семью: ");
                int number = source.nextInt();
                dogList.remove(number - 1);
                String out = String.format("Собака была успешна переведена в семью. Теперь в приюте %s собак", dogList.size());
                System.out.println(out);
            }

            if (line.equals("info")) {
                System.out.println("Текущая информация о собаках в питомнике: ");
                for (int i = 0; i < dogList.size(); i ++) {
                    Dog d = dogList.get(i);
                    System.out.println(d.toString() + "\n" + "Кол-во собак: " + Dog.getCount());
                }
            }

            if (line.equals("help")) {
                System.out.println("Список доступных команд: " + "\n"
                        + "add >> добавить некоторое количество собак" + "\n"
                        + "human >> узнать возраст собаки в человеческих годах" + "\n"
                        + "let >> дать собаке новый дом и семью" + "\n"
                        + "info >> вывести информацию о собаках в питомнике" + "\n"
                        + "stop >> завершить работу программы"
                        + "help >> вывести список доступных команд");
            }

            if (line.equals("stop")) {
                break;
            }

        }
        System.out.println("Работа программы завершена.");
    }
}
