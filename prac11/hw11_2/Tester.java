package polyankina_kvbo0821.prac11.hw11_2;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Tester {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        Date date2 = new Date();
        String s = reader.readLine();
        date1 = sdf.parse(s);
        System.out.println(date1);
        System.out.println(date2);
        int result = date1.compareTo(date2);

        if (result == 0) {
            System.out.println("Both date are the same");
        }
        else if (result < 0) {
            System.out.println("Input date before pc date");
        }
        else {
            System.out.println("Input date is after pc date");
        }

    }
}
