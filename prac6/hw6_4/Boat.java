package polyankina_kvbo0821.prac6.hw6_4;

public class Boat implements Priceable {

    private String type;
    private int price;

    public Boat(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
