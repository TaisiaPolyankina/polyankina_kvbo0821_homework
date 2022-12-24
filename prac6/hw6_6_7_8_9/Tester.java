package polyankina_kvbo0821.prac6.hw6_6_7_8_9;

import polyankina_kvbo0821.prac6.hw6_4.Priceable;

public class Tester {
    public static void main(String[] args) {

        Book b1 = new Book("Crime and punishment");
        Book b2 = new Book("Nightwatch");
        Magazine m1 = new Magazine("AIDSinfo");
        Magazine m2 = new Magazine("Discovery");
        Printable[] printable = {b1, b2, m1, m2};
        for (int i=0; i<printable.length; i++) {
            printable[i].print();
        }
    }
}
