package polyankina_kvbo0821.prac6.hw6_4;

public class Tester {
    public static void main(String[] args) {
        Priceable pc1 = new Pc("HP", 40000);
        Priceable b1 = new Boat("Yacht", 300000);
        System.out.println(pc1.getPrice());
        System.out.println(b1.getPrice());
    }
}
