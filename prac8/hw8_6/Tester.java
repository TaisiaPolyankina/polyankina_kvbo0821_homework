package polyankina_kvbo0821.prac8.hw8_6;

public class Tester {

    public static String isPrime(int n, int i) {

        if (n < 2) {
            return "No";
        }
        else if (n == 2) {
            return "Yes";
        }
        else if (n % i == 0) {
            return "No";
        }
        else if (i < Math.sqrt(n)) {
            return isPrime(n, i +1);
        }
        else {
            return "Yes";
        }

    }

    public static void main(String[] args) {
        System.out.println(isPrime(13, 2));
    }

}
