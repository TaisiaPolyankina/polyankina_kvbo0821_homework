package polyankina_kvbo0821.prac19_1;

import java.util.*;

import static polyankina_kvbo0821.prac19_1.Tester.Purchases.checkInn;

public class Tester {

    public class Purchases {
        public static boolean checkInn(int Inn, int[] data) throws InnNotValidException {
            int i = 0;
            while (Inn != data[i]) {
                i++;
                if (i > 3) throw new InnNotValidException(Inn);
            }
            return true;
        }
    }

    public static void main(String[] args) {

        int[] data = new int[4];
        int j = 111111;
        for (int i = 0; i < 4; i++) {
            data[i] = j;
            j += 333333;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер ИНН: ");
        try {
            int Inn = sc.nextInt();
            checkInn(Inn, data);
        } catch (InnNotValidException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(0);
        }
        System.out.println("ИНН действителен!");

    }

}
