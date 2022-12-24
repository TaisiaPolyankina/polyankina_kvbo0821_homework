package polyankina_kvbo0821.prac4.hw4_ex2;

import polyankina_kvbo0821.prac4.hw4_ex2.Clothes;
import polyankina_kvbo0821.prac4.hw4_ex2.MenClothing;

public class Tie extends Clothes implements MenClothing {
    private int tag;
    public Tie(String size, String colour, int cost, int tag) {
        super(size, colour, cost);
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public void dressMan() {
        System.out.println("A man is dressed in tie");
    }
}
