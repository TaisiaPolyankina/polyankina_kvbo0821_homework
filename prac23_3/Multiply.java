package polyankina_kvbo0821.prac23_3;

public class Multiply extends MathOperation {

    public Multiply(Operation left, Operation right) {
        super(left, right);
    }

    public Multiply(Operation left, Variable vRight) {
        super(left, vRight);
    }

    public Multiply(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Multiply(Variable vLeft, Operation right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() * right.getValue();
    }

}
