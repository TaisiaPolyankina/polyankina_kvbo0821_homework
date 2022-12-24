package polyankina_kvbo0821.prac4.hw4_ex2;

public class Skirt extends Clothes implements WomenClothing {
    private int tag;
    public Skirt(String size, String colour, int cost, int tag) {
        super(size, colour, cost);
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }

    public void dressWoman() {
        System.out.println("A woman is dressed in skirt");
    }
}
