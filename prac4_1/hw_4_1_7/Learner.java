package polyankina_kvbo0821.prac4_1.hw_4_1_7;

public class Learner {

    private String name;
    private String secondName;

    public Learner(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }

}

class SchoolStudent extends Learner {

    public SchoolStudent(String name, String secondName) {
        super(name, secondName);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getSecondName() {
        return super.getSecondName();
    }
}

class UniversityStudent extends Learner {

    public UniversityStudent(String name, String secondName) {
        super(name, secondName);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getSecondName() {
        return super.getSecondName();
    }
}

class Tester {
    public static void main(String[] args) {

        Learner[] L1 = new Learner[3];
        L1[0] = new SchoolStudent("Arina", "Polyankina");
        L1[1] = new SchoolStudent("Max", "Frye");
        L1[2] = new UniversityStudent("Taisiya", "Polyankina");

        for (int i=0; i <L1.length; i++) {
            if (L1[i] instanceof SchoolStudent) {
                System.out.print("This person attends school: ");
                System.out.println(L1[i].getName() + " " + L1[i].getSecondName());
            }
            else if (L1[i] instanceof UniversityStudent) {
                System.out.print("This person attends university: ");
                System.out.println(L1[i].getName() + " " + L1[i].getSecondName());
            }
        }
    }
}