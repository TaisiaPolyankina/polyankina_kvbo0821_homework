package polyankina_kvbo0821.prac9.hw9_2;

public class Tester {

    public static int partition(Comparable[] comparable, int left, int right) {

        Comparable part = comparable[left];
        int p = left;
        for (int r = left + 1; r <= right; r ++) {
            int comp = comparable[r].compareTo(part);
            if (comp < 0) {
                comparable[p] = comparable[r];
                comparable[r] = comparable[p + 1];
                comparable[p + 1] = part;
                p ++;
            }
        }
        return p;

    }

    public static void quicksort(Comparable[] comparable, int left, int right) {

        if (left < right) {
            int p = partition(comparable, left, right);
            quicksort(comparable, left, p-1);
            quicksort(comparable, p+1, right);
        }

    }

    public static void main(String[] args) {

        SortingStudentsByGPA[] students = new SortingStudentsByGPA[] {
                new SortingStudentsByGPA(71), new SortingStudentsByGPA(43),
                new SortingStudentsByGPA(39), new SortingStudentsByGPA(91)
        };
        quicksort(students, 0, students.length-1);
        for (SortingStudentsByGPA s : students) {
            System.out.println(s);
        }

    }

}
