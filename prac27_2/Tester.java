package polyankina_kvbo0821.prac27_2;

public class Tester {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        dictionary.hashtabHash();
        dictionary.hashtabInit();
        dictionary.hashtabAdd("Sorsha", "Swordsmen");
        dictionary.hashtabAdd("Valeska", "Crossbowmen");
        dictionary.hashtabAdd("Edric", "Griffins");
        dictionary.hashtabAdd("Haart", "Money");
        dictionary.hashtabAdd("Tyris", "Cavalrymen");
        dictionary.hashtabAdd("Ryon", "Heal");
        dictionary.hashtabAdd("Katbert", "Weakness");
        dictionary.hashtabAdd("Adelaide", "Frost");
        dictionary.hashtabAdd("Inham", "Monks");
        dictionary.hashtabAdd("Loynis", "Pray");
        dictionary.print();
        System.out.println("\n" + dictionary.hashtabLookup("Valeska"));
        dictionary.hashtabDelete("Ryon");

    }
}
