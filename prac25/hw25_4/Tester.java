package polyankina_kvbo0821.prac25.hw25_4;

import java.util.regex.*;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        String s = "225.4 RUB, 88.2USD 44ERR sdgsdgsdgs 00.4 EU";
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        System.out.println(ans);
    }
}
