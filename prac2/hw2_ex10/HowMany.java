package polyankina_kvbo0821.prac2.hw2_ex10;
// part 2 ex 10
public class HowMany {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i < args.length; i++) {
            count ++;
        }
        String s = String.format("Вы ввели %s слов с консоли", count);
        System.out.println(s);
    }
}
