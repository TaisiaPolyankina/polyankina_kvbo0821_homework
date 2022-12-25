package polyankina_kvbo0821.prac23_3;

public class Subtract extends MathOperation{

    public Subtract(Operation left, Operation right) {
        super(left, right);
    }

    public Subtract(Operation left, Variable vRight) {
        super(left, vRight);
    }

    public Subtract(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Subtract(Variable vLeft, Operation right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() - right.getValue();
    }

}
