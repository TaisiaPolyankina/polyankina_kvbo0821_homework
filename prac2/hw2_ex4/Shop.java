package polyankina_kvbo0821.prac2.hw2_ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    Scanner source = new Scanner(System.in);
    ArrayList<Pc> computerList = new ArrayList<>();
    public Shop() {
        ArrayList<Pc> computerList = new ArrayList<>();
    }

    public void addPc(String model, int year, int cost, int RAM, int memory) {
        computerList.add(new Pc(model, year, cost, RAM, memory));
    }

    public void deletePc(int i) {
        computerList.remove(i - 1);
    }

    public void searchPc(String request, int counter) {
        if (request.equals("model")) {
            System.out.print("Введите модель: ");
            String param_str = source.nextLine();
            for (int i = 0; i < counter; i++) {
                Pc p = computerList.get(i);
                String buff_str = p.getModel();
                if (buff_str.equals(param_str)) {
                    System.out.println("Поиск завершён успешно. Результат: " + "\n" + p.toString());
                    break;
                }
                System.out.println("В списке нет пк с нужным вам параметром.");
            }
        }
        else if (request.equals("year")) {
            System.out.print("Введите год: ");
            int param = source.nextInt();
            for (int i = 0; i < counter; i++) {
                Pc p = computerList.get(i);
                int buff = p.getYear();
                if (buff == param) {
                    System.out.println("Поиск завершён успешно. Результат: " + "\n" + p.toString());
                    break;
                }
                System.out.println("В списке нет пк с нужным вам параметром.");
            }
        }
        else if (request.equals("cost")) {
            System.out.print("Введите стоимость: ");
            int param = source.nextInt();
            for (int i = 0; i < counter; i++) {
                Pc p = computerList.get(i);
                int buff = p.getCost();
                if (buff == param) {
                    System.out.println("Поиск завершён успешно. Результат: " + "\n" + p.toString());
                    break;
                }
                System.out.println("В списке нет пк с нужным вам параметром.");
            }
        }
        else if (request.equals("RAM")) {
            System.out.print("Введите RAM: ");
            int param = source.nextInt();
            for (int i = 0; i < counter; i++) {
                Pc p = computerList.get(i);
                int buff = p.getRAM();
                if (buff == param) {
                    System.out.println("Поиск завершён успешно. Результат: " + "\n" + p.toString());
                    break;
                }
                System.out.println("В списке нет пк с нужным вам параметром.");
            }
        }
        else if (request.equals("memory")) {
            System.out.print("Введите объём памяти: ");
            int param = source.nextInt();
            for (int i = 0; i < counter; i++) {
                Pc p = computerList.get(i);
                int buff = p.getMemory();
                if (buff == param) {
                    System.out.println("Поиск завершён успешно. Результат: " + "\n" + p.toString());
                    break;
                }
                System.out.println("В списке нет пк с нужным вам параметром.");
            }
        }
        else if (request.equals("number")) {
            System.out.print("Введите номер компьютера из списка: ");
            int num = source.nextInt();
            Pc p = computerList.get(num - 1);
            System.out.println("Поиск завершён успешно. Результат: " + "\n" + p.toString());
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < computerList.size(); i++) {
            Pc elem = computerList.get(i);
            s = s + elem.toString() + "\n";
        }
        return s;
    }
}
