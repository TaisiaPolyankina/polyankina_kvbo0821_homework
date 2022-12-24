package polyankina_kvbo0821.prac9.hw9_2;

public class SortingStudentsByGPA implements Comparable {

    private int GPA;

    public SortingStudentsByGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public int compareTo(Object o) {
        return this.GPA - ((SortingStudentsByGPA) o).GPA;
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "GPA=" + GPA +
                '}';
    }
}
