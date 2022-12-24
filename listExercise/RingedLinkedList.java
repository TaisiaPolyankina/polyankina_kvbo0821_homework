package polyankina_kvbo0821.listExercise;

public class RingedLinkedList {
    NodeRinged head;
    int size;

    public RingedLinkedList() {
        this.size = 0;
    }

    public void addLast(String name, String genre, int release_date) {
        NodeRinged node = new NodeRinged();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            NodeRinged n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        node.first = head;
        size += 1;
    }

    public void addTo(int index, String name, String genre, int release_date) {
        NodeRinged node = new NodeRinged();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        if (index == 0) {
            head = head.next;
        }
        else {
            NodeRinged n = head;
            for (int i = 0; i < index - 1; i ++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        node.first = head;
        size += 1;
    }

    public void addFirst(String name, String genre, int release_date) {
        NodeRinged node = new NodeRinged();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        node.next = head;
        head = node;
        node.first = head;
        size += 1;
    }

    public void deleteAt (int index) {
        if (index == 0) {
            head = head.next;
            NodeRinged n = head;
            for (int i = 0; i < size; i ++) {
                n = n.next;
            }
            n.first = head;
        }
        else {
            NodeRinged n = head;
            for (int i = 0; i < index - 1; i ++) {
                n = n.next;
            }
            NodeRinged n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
        size -= 1;
    }

    public void show() {
        NodeRinged node = head;
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
        NodeRinged node = head;
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }

    public void last() {
        NodeRinged node = new NodeRinged();
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            NodeRinged n = head;
            for (int i = 0; i < size - 1; i ++) {
                n = n.next;
            }
            node = n;
        }
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }

}
