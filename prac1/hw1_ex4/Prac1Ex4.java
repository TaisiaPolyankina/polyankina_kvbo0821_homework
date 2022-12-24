package polyankina_kvbo0821.prac1.hw1_ex4;

import java.util.Scanner;

public class Prac1Ex4 {
    public static void main(String[] args) {
        int [] b = new int[10];
        int max = 0;
        int min = 9999;
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while(counter < b.length) {
            System.out.println("Enter an integer number: ");
            b[counter] = sc.nextInt();
            counter += 1;
        }

        for(int i = 0; i < b.length; i++) {
            if(b[i] <= min) {
                min = b[i];
            }
            if(b[i] >= max) {
                max = b[i];
            }
        }

        System.out.print("Min: " + min + "\n" + "Max: " + max);
    }
}
