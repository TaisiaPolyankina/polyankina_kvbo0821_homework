package polyankina_kvbo0821.prac6.hw6_6_7_8_9;

public class Magazine implements Printable {

    private String magazineTitle;

    public Magazine(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    public void setMagazineTitle(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    public String getMagazineTitle() {
        return magazineTitle;
    }

    public void print() {
        System.out.println("Title (magazine): " + getMagazineTitle());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "magazineTitle='" + magazineTitle + '\'' +
                '}';
    }
}
