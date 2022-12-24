package polyankina_kvbo0821.prac8.hw8_7;

public class Tester {

    public static void dissolve(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.println(a + " ");
                    dissolve(n / a);
                }
                else {
                    System.out.println(a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        dissolve(50);
    }

}
