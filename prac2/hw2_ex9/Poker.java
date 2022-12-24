package polyankina_kvbo0821.prac2.hw2_ex9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


// part 2 ex 9
public class Poker {

    public static int randomInt(ArrayList <String> cards) {
        return new Random().nextInt(cards.size());
    }

    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        ArrayList<String> given_cards = new ArrayList<>();
        String[] suits = {"_hearts", "_spades", "_diamonds", "_clubs"};
        String[] highCards = {"J", "Q", "K", "A"};
        Scanner source = new Scanner(System.in);
        int number = 0;

        // creating a deck
        for (int i = 0; i < 4; i ++) {
            for (int j = 2; j < 11; j ++) {
                String card = j + suits[i];
                cards.add(card);
            }
            for (int k = 0; k < 4; k ++) {
                String card = highCards[k] + suits[i];
                cards.add(card);
            }
        }

        System.out.println("Введите количество игроков: ");
        int n = source.nextInt();

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < 5; j ++) {
                int ind = randomInt(cards);
                given_cards.add(cards.get(ind));
                cards.remove(ind);
            }
        }

        for (int i = 0; i < given_cards.size(); i ++) {
            if (i % 5 == 0) {
                number += 1;
                String s = String.format("\nНабор карт игрока %s:", number);
                System.out.println(s);
            }
            System.out.println(given_cards.get(i));
        }

    }
}
