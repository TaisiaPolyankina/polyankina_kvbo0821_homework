package polyankina_kvbo0821.listExercise;
// exerciseLists_Exercise_2_2
public class DoubleLinkedList {
    NodeDouble head;
    int size;

    public DoubleLinkedList() {
        this.size = 0;
    }

    public void addLast(String name, String genre, int release_date) {
        NodeDouble node = new NodeDouble();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        node.next = null;
        node.prev = null;
        if (head == null) {
            head = node;
        }
        else {
            NodeDouble n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
        size += 1;
    }

    public void addFirst(String name, String genre, int release_date) {
        NodeDouble node = new NodeDouble();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        node.next = head;
        node.prev = null;
        head = node;
        size += 1;
    }

    public void addTo(int index, String name, String genre, int release_date) {
        NodeDouble node = new NodeDouble();
        node.name = name;
        node.genre = genre;
        node.release_date = release_date;
        if (index == 0) {
            head = head.next;
            node.prev = null;
        }
        else {
            NodeDouble n = head;
            for (int i = 0; i < index - 1; i ++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            node.prev = n;
        }
        size += 1;
    }

    public void deleteAt (int index) {
        if (index == 0) {
            head = head.next;
        }
        else {
            NodeDouble n = head;
            for (int i = 0; i < index - 1; i ++) {
                n = n.next;
            }
            NodeDouble n1 = n.next;
            n.next = n1.next;
            if (n1.next != null) {
                NodeDouble n2 = n1.next;
                n2.prev = n;
            }
            n1 = null;
        }
        size -= 1;
    }

    public void show() {
        NodeDouble node = head;
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
        NodeDouble node = head;
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }

    public void last() {
        NodeDouble node = new NodeDouble();
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            NodeDouble n = head;
            for (int i = 0; i < size - 1; i ++) {
                n = n.next;
            }
            node = n;
        }
        System.out.println(node.getName() + ' ' + node.getGenre() + ' ' + node.getRelease_date());
    }

}
