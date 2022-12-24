package polyankina_kvbo0821.prac2.hw2_ex5;

public class Dog {
    private String name;
    private int age;
    static private int count = 0;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public int humanAge(int age) {
        return age * 7;
    }

    public static int getCount() { // static к нему может обращаться только КЛАСС, а не объект класса
        return count;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count += 1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
