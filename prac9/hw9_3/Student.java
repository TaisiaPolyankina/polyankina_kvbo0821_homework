package polyankina_kvbo0821.prac9.hw9_3;

public class Student implements Comparable {

    private int id;

    public Student(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Object o) {
        return this.id - ((Student) o).id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
