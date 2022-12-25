package polyankina_kvbo0821.prac23_3;

public class Add extends MathOperation{

    public Add(Operation left, Operation right) {
        super(left, right);
    }

    public Add(Operation left, Variable vRight) {
        super(left, vRight);
    }

    public Add(Variable vLeft, Variable vRight) {
        super(vLeft, vRight);
    }

    public Add(Variable vLeft, Operation right) {
        super(vLeft, right);
    }

    @Override
    public double getValue() {
        return left.getValue() + right.getValue();
    }

}
