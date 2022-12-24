package polyankina_kvbo0821.prac9.hw9_1;

import polyankina_kvbo0821.prac9.hw9_1.Student;

public class Tester {

    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int i=0; i < list.length - 1; i++) {
            min = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j].compareTo(list[min]) < 0) {
                    min = j;
                    temp = list[min];
                    list[min] = list[i];
                    list[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[] {
                new Student(913), new Student(901),
                new Student(631), new Student(123)
        };

        selectionSort(students);
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
