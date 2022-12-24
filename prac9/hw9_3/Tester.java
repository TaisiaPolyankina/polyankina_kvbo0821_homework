package polyankina_kvbo0821.prac9.hw9_3;

public class Tester {

    public static void mergeSort(Student[] s, int n) {

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(s, 0, l, 0, mid);
        System.arraycopy(s, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(s, l, r, mid, n - mid);

    }

    public static void merge(Student[] s, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                s[k++] = l[i++];
            }
            else {
                s[k++] = r[j++];
            }
        }
        while (i < left) {
            s[k++] = l[i++];
        }
        while (j < right) {
            s[k++] = r[j++];
        }

    }

    public static void main(String[] args) {

        Student[] students1 = new Student[] {
            new Student(491), new Student(941),
            new Student(184), new Student(394)
        };

        Student[] students2 = new Student[] {
                new Student(381), new Student(520),
                new Student(591), new Student(201)
        };

        Student[] allStudents = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, allStudents, 0, students1.length);
        System.arraycopy(students2, 0, allStudents, students1.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }

    }

}
