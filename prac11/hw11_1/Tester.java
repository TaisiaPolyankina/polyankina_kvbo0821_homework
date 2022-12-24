package polyankina_kvbo0821.prac11.hw11_1;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        String surname = "Polyankina";
        Date date = new Date();
        System.out.println(surname + " recieved a task at " + date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 28);

        System.out.println(surname + " completed the task at " + calendar.getTime());

    }
}
