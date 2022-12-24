package polyankina_kvbo0821.prac18.hw18_2;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = scanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        } catch (NumberFormatException e) {
            System.out.println("Not an integer");
        }

    }

}
