package polyankina_kvbo0821.prac4_1.hw_4_1_3;

class Person {

    private String fullName;
    private int age;

    public void talk(){
        System.out.println(fullName + " is speaking to you");
    }
    public void move(){
        System.out.println("They are moving");
    }

    public Person(){
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}

class Tester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Nikolai Dibovsky",31);
        person2.talk();
        person1.talk();
    }
}
