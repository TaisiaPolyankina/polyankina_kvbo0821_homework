package polyankina_kvbo0821.prac2.hw2_ex6;

import polyankina_kvbo0821.prac2.hw2_ex6.CircleSix;

import java.util.ArrayList;
import java.util.Scanner;

public class CircleSixTest {
    static ArrayList<CircleSix> circlesList = new ArrayList<>();

    public static void addCircle(double x, double y, double r) {
        circlesList.add(new CircleSix(x, y, r));
    }

    public static void compareTwoCircles(double r1, double r2) { // можно так cir1.compare(cir2) эт метод в классе cir
        if (r1 > r2) {
            String out = String.format("Окружность %s с радиусом %s больше окружности %s", 1, r1, 2);
            System.out.println(out);
        }
        else if (r2 > r1) {
            String out = String.format("Окружность %s с радиусом %s больше окружности %s", 2, r2, 1);
            System.out.println(out);
        }
        else {
            System.out.println("Обе окружности равны");
        }
    }

    public static void main(String[] args) {
        double x;
        double y;
        double r;

        Scanner source = new Scanner(System.in);
        System.out.println("Введите x, y, r первой окружности: ");
        x = source.nextDouble();
        y = source.nextDouble();
        r = source.nextDouble();
        addCircle(x, y, r);
        System.out.println("Введите x, y, r второй окружности: ");
        x = source.nextDouble();
        y = source.nextDouble();
        r = source.nextDouble();
        addCircle(x, y, r);
        System.out.println("Информация об окружностях: ");
        for (int i = 0; i < circlesList.size(); i ++) {
            CircleSix d = circlesList.get(i);
            String out = String.format(d.toString() + " где (x, y) -- координаты центра окружности, r -- радиус" + "\n"
            + "Площадь окружности: %s" + "\n" + "Длина окружности: %s", d.Area(d.getR()), d.Length(d.getR()));
            System.out.println(out);
        }
        CircleSix d1 = circlesList.get(0);
        CircleSix d2 = circlesList.get(1);
        System.out.println("Сравнение двух окружностей: ");
        compareTwoCircles(d1.getR(), d2.getR());
    }
}
