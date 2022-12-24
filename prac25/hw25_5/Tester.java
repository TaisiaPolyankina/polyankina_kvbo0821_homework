package polyankina_kvbo0821.prac25.hw25_5;

import java.util.regex.*;

public class Tester {
    public static void main(String[] args) {
        System.out.println(valid_date("1/1/1899"));
        System.out.println(valid_date("29/02/2001"));
        System.out.println(valid_date("29/02/2000"));
    }

    public static boolean valid_date(String s){
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }
}
