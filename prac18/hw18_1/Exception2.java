package polyankina_kvbo0821.prac18.hw18_1;

public class Exception2 {

    public void exceptionDemo() {
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

}
