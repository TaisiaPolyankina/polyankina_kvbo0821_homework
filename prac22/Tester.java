package polyankina_kvbo0821.prac22;

public class Tester {
    public static void main(String[] args) {
        System.out.println(Calculator.ExpressionRPN("(2+2)*2"));
        System.out.println(Calculator.RPNtoCalculate(Calculator.ExpressionRPN("(2+2)*2")));
    }
}
