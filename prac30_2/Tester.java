package polyankina_kvbo0821.prac30_2;

public class Tester {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(8);
        tree.insert(4);
        tree.insert(12);
        tree.insert(2);
        tree.insert(6);
        tree.insert(10);
        tree.insert(14);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(11);
        tree.insert(13);
        tree.insert(15);
        System.out.println("Tree : \n");
        tree.printTree();
        tree.deleteNode(4);
        System.out.println("Tree : \n");
        tree.printTree();
        tree.clear();
        System.out.println("Tree : \n");
        tree.printTree();

    }
}
