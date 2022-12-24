package polyankina_kvbo0821.prac29;

import java.util.Scanner;
import java.util.Stack;

public class Tester {
    public static void main(String[] args) {

        int N;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        int[][] roads = new int[N][N];

        for (int i=0; i < roads.length; i++) {
            for (int j=0; j < roads.length; j++) {
                roads[i][j] = scanner.nextInt();
            }
        }

        int step=0;
        for (int i=0; i < roads.length; i++) {
            for (int j=0; j < step; j++) {
                sum += roads[j][i];
            }
            step += 1;
        }

        System.out.println("There are " + sum + " roads on the Neptune");

    }
}
