package polyankina_kvbo0821.prac6.hw6_4;

public class Pc implements Priceable {

    private String model;
    private int price;

    public Pc(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
