package polyankina_kvbo0821.prac2.hw2_ex2;

import polyankina_kvbo0821.prac2.hw2_ex2.Ball;

import java.lang.*;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(0, 0);
        System.out.println("Начальное положение мяча\n" + "по x: " + b.getX() + "\nпо y: " + b.getY());
        System.out.println("Опишите новое положение мяча по x: ");
        Scanner source = new Scanner(System.in);
        double xDisp = source.nextDouble();
        System.out.println("Опишите новое положение мяча по y: ");
        double yDisp = source.nextDouble();
        b.move(xDisp, yDisp);
        System.out.println("Общая сводка: " + b.toString());
    }
}
