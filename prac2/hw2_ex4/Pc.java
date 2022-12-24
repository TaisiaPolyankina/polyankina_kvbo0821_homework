package polyankina_kvbo0821.prac2.hw2_ex4;

public class Pc {
    protected String model;
    protected int year;
    protected int cost;
    protected int RAM;
    protected int memory;

    // only getters because you cannot rebuild a pc in the shop
    public int getMemory() {
        return memory;
    }
    public int getRAM() {
        return RAM;
    }
    public int getCost() {
        return cost;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }

    public Pc(String model, int year, int cost, int RAM, int memory) {
        this.model = model;
        this.year = year;
        this.cost = cost;
        this.RAM = RAM;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", cost='" + cost + '\'' +
                ", RAM=" + RAM +
                ", memory=" + memory +
                '}';
    }
}
