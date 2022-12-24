package polyankina_kvbo0821.prac4.hw4_ex2;

public class TShirt extends Clothes implements WomenClothing, MenClothing {
    private int tag;
    public TShirt(String size, String colour, int cost, int tag) {
        super(size, colour, cost);
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public void dressMan() {
        System.out.println("The man is dressed in TShirt");
    }
    public void dressWoman() {
        System.out.println("The woman is dressed in TShirt");
    }
}
