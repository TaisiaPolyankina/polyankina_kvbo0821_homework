package polyankina_kvbo0821.prac4.hw4_ex2;

public class Pants extends Clothes implements WomenClothing, MenClothing {
    private int tag;
    public Pants(String size, String colour, int cost, int tag) {
        super(size, colour, cost);
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public void dressMan() {
        System.out.println("A man is dressed in pants");
    }
    public void dressWoman() {
        System.out.println("A woman is dressed in pants");
    }
}
