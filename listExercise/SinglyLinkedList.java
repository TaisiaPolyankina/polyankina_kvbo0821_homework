package polyankina_kvbo0821.listExercise;
// exerciseLists_Exercise_1_2
public class SinglyLinkedList {
    Node head;
    int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void addLast(String name, String genre, int release_date) {
        Node node = new Node();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        size += 1;
    }

    public void addTo(int index, String name, String genre, int release_date) {
        Node node = new Node();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        if (index == 0) {
            head = head.next;
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i ++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        size += 1;
    }

    public void addFirst(String name, String genre, int release_date) {
        Node node = new Node();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        node.next = head;
        head = node;
        size += 1;
    }

    public void deleteAt (int index) {
        if (index == 0) {
            head = head.next;
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i ++) {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
        size -= 1;
    }

    public void show() {
        Node node = head;
        while(node.next != null) {
            System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
            node = node.next;
        }
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void first() {
        Node node = head;
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }

    public void last() {
        Node node = new Node();
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
            for (int i = 0; i < size - 1; i ++) {
                n = n.next;
            }
            node = n;
        }
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }
}
