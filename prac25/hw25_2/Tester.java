package polyankina_kvbo0821.prac25.hw25_2;

import java.util.regex.*;

public class Tester {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher("abcdefghijklmnopqrstuv18340");
        Matcher m2 = p1.matcher("abcdefghijklmnoasdfasdpqrstuv18340.");
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        System.out.println("First test is " + b1);
        System.out.println("Second test is " + b2);
    }
}
