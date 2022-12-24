package polyankina_kvbo0821.prac2.hw2_ex3;

import java.lang.*;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        double x;
        double y;
        double r;
        Circle c [] = new Circle[3];
        Scanner source = new Scanner(System.in);
        for(int i = 0; i < c.length; i++) {
            String s = String.format("Введите х и у центра, радиус окружности номер %s: ", i + 1);
            System.out.println(s);
            x = source.nextDouble();
            y = source.nextDouble();
            r = source.nextDouble();
            c[i] = new Circle(x, y, r);
        }

        for(int i = 0; i < c.length; i++) {
            String s = String.format("Информация об окружности номер %s: ", i + 1);
            System.out.print(s + c[i].toString() + "\n");
        }

        for(int i = 0; i < c.length; i++) {
            String s = String.format("Введите новые x и y центра, новый радиус окружности номер %s: ", i + 1);
            System.out.println(s);
            x = source.nextDouble();
            y = source.nextDouble();
            r = source.nextDouble();
            c[i].SetCentre(x, y);
            c[i].setR(r);
        }

        for(int i = 0; i < c.length; i++) {
            String s = String.format("Обновлённая информация об окружности номер %s: ", i + 1);
            System.out.print(s + c[i].toString() + "\n");
        }
    }
}
