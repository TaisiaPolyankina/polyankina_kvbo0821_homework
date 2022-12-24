package polyankina_kvbo0821.prac1.hw1_ex3;

public class Prac1Ex3 {
    public static void main (String[] args) {
        int [] b = new int[10];
        int s = 0;
        for(int i = 0; i < b.length; i++) {
            b[i] = i;
        }
        for(int i = 0; i < b.length; i++) {
            s += b[i];
        }
        int mid = s / b.length;
        System.out.println("Summary: " + s + "\n" + "Average: " + mid);
    }
}
