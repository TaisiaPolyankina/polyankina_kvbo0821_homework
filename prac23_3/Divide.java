package polyankina_kvbo0821.prac23_3;

public class Divide extends MathOperation{

    public Divide(Operation left, Variable vRight) {
        super(left, vRight);
    }

    public Divide(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Divide(Variable vLeft, Operation right) {
        super(vLeft, right);
    }

    public Divide(Operation left, Operation right) {
        super(left, right);
    }

    @Override
    public double getValue() {
        return left.getValue() / right.getValue();
    }

}
