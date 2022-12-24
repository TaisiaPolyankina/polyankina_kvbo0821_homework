package polyankina_kvbo0821.prac13.hw13_1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println(s1);
        System.out.println(s1.charAt(s1.length() - 1)); // the last char
        System.out.println(s1.endsWith("!!!")); // seeks substring in the end
        System.out.println(s1.startsWith("I like")); // seeks substring at the beginning
        System.out.println(s1.contains("Java")); // seeks substring anywhere
        System.out.println(s1.indexOf("Java")); // seeks start of the substring
        System.out.println(s1.replace('a', 'o')); // change 'a' symbols to 'o'
        System.out.println(s1.toUpperCase()); // convert to uppercase
        System.out.println(s1.toLowerCase()); // convert to lowercase
        System.out.println(s1.substring(s1.indexOf("Java"), s1.indexOf('!'))); // takes substring
        System.out.println(s1.lastIndexOf("Java"));
    }
}
