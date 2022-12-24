package polyankina_kvbo0821.prac11.hw11_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Tester {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-k-m");
        Date date = new Date();
        String s = reader.readLine();
        date = sdf.parse(s);
        System.out.println(date);

    }
}
