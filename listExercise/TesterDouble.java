package polyankina_kvbo0821.listExercise;
// exerciseLists_Exercise_2_3
public class TesterDouble {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst("Tetris", "Puzzle", 1984);
        list.addFirst("Axiom verge", "Metrodivania", 2015);
        list.addFirst("Touhou 13", "Bullet hell", 2013);
        list.addLast("Disciples 2", "Strategy", 2002);
        list.addTo(2, "Sims 2", "Simulator", 2004);
        list.show();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.deleteAt(1);
        list.first();
        list.last();
    }
}
