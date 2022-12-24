package polyankina_kvbo0821.prac4.hw4_ex2;

public abstract class Clothes {
    private String size;
    private String colour;
    private int cost;

    public Clothes(String size, String colour, int cost) {
        this.size = size;
        this.colour = colour;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", cost=" + cost +
                '}';
    }
}
