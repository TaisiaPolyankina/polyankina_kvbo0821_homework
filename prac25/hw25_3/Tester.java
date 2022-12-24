package polyankina_kvbo0821.prac25.hw25_3;

import java.util.regex.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "[0-9]+[ ]*[+]";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher( "6/5–2×9");
        Matcher m2 = p1.matcher("(1+8)–9/4");
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        System.out.println(b1);
        System.out.println(b2);
    }
}
