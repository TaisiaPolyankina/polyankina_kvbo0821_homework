package polyankina_kvbo0821.prac20;

public class Tester {
    public static void main(String[] args) {
        Generic<String, Penguin, Integer> generic = new Generic<>("friend", new Penguin(), 42);
        generic.show();
    }
}
