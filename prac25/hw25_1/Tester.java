package polyankina_kvbo0821.prac25.hw25_1;

import java.util.regex.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Pattern p3 = Pattern.compile(" ");
        String[] words = p3.split(sc1.nextLine());
        for(String word : words){
            System.out.println(word);
        }
    }
}
