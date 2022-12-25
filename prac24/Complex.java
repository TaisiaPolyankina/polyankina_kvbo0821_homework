package polyankina_kvbo0821.prac24;

public class Complex extends ConcreteFactory{

    private int real;
    private int image;
    public Complex() {
        System.out.println("Number was created");
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
        print();
    }

    public void print() {
        String s = "";
        if(image != 0) {
            if (real == 0)
                s = image + "i";
            else {
                if(image > 0)
                    s = real + "+" + image + "i";
                else
                    s = real + "" + image + "i";
            }
        }
        else
            s = "" + real;
        System.out.println("The number: " + s);
    }

}
