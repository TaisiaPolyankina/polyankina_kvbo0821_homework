package polyankina_kvbo0821.prac1.hw1_ex6;

public class Prac1Ex6 {
    public static void main(String[] args) {
        String s = String.format("The %sst number is %s", 1, 1);
        System.out.println(s);
        for(int i = 2; i < 11; i++) {
            s = String.format("The %sst number is 1/%s", i, i);
            System.out.println(s);
        }
    }
}
