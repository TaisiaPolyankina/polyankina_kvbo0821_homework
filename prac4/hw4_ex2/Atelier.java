package polyankina_kvbo0821.prac4.hw4_ex2;

import java.util.ArrayList;

public class Atelier {
    ArrayList<Clothes> clothes = new ArrayList<>();
    ArrayList<Integer> clothesTags = new ArrayList<>(); // в том же порядке, что и одежда выше

    public void addPieceTShirt(String size, String colour, int cost) {
        int tag = 0;
        clothes.add(new TShirt(size, colour, cost, tag));
        clothesTags.add(tag);
    }

    public void addPiecePants(String size, String colour, int cost) {
        int tag = 1;
        clothes.add(new Pants(size, colour, cost, tag));
        clothesTags.add(tag);
    }

    public void addPieceSkirt(String size, String colour, int cost) {
        int tag = 2;
        clothes.add(new Skirt(size, colour, cost, tag));
        clothesTags.add(tag);
    }

    public void addPieceTie(String size, String colour, int cost) {
        int tag = 3;
        clothes.add(new Tie(size, colour, cost, tag));
        clothesTags.add(tag);
    }

    public void dressWoman(ArrayList<Clothes> clothes) {
        for (int i = 0; i < clothes.size(); i++) {
            switch (clothesTags.get(i)) {
                case (0):
                    Clothes pieceTS = clothes.get(i);
                    System.out.println("Одежда № " + (i + 1) + "\nТип: футболка\n" + pieceTS.toString());
                case (1):
                    Clothes pieceP = clothes.get(i);
                    System.out.println("Одежда № " + (i + 1) + "\nТип: штаны\n" + pieceP.toString());
                case (2):
                    Clothes pieceS = clothes.get(i);
                    System.out.println("Одежда № " + (i + 1) + "\nТип: юбка\n" + pieceS.toString());
            }
        }
    }

    public void dressMan(ArrayList<Clothes> clothes) {
        for (int i = 0; i < clothes.size(); i++) {
            switch (clothesTags.get(i)) {
                case (0):
                    Clothes pieceTS = clothes.get(i);
                    System.out.println("Одежда № " + (i + 1) + "\nТип: футболка\n" + pieceTS.toString());
                case (1):
                    Clothes pieceP = clothes.get(i);
                    System.out.println("Одежда № " + (i + 1) + "\nТип: штаны\n" + pieceP.toString());
                case (3):
                    Clothes pieceT = clothes.get(i);
                    System.out.println("Одежда № " + (i + 1) + "\nТип: галстук\n" + pieceT.toString());
            }
        }
    }
}
