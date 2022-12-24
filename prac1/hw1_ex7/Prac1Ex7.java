package polyankina_kvbo0821.prac1.hw1_ex7;

import java.util.Scanner;

public class Prac1Ex7 {

    public static int fact(int n) {
        int res = 1;
        while(n > 1) {
            res *= n;
            n -= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        int r = fact(n);
        String s = String.format("The factorial of %s is %s", n, r);
        System.out.print(s);
    }
}
