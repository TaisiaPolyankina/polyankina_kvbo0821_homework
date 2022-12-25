package polyankina_kvbo0821.prac23_3;

public abstract class MathOperation extends Operation{

    protected Operation left, right;
    protected Variable vLeft, vRight;

    public MathOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    public MathOperation(Operation left, Variable vRight) {
        this.left = left;
        this.vRight = vRight;
    }

    public MathOperation(Variable vLeft, Variable vRight) {
        this.vLeft = vLeft;
        this.vRight = vRight;
    }

    public MathOperation(Variable vLeft, Operation right) {
        this.vLeft = vLeft;
        this.right = right;
    }

    public abstract double getValue();

    public double evaluate(double v){
        if(right == null)
            right = vRight.toConst(v);
        if(left == null)
            left = vLeft.toConst(v);
        if(left instanceof MathOperation)
            ((MathOperation) left).evaluate(v);
        if(right instanceof MathOperation)
            ((MathOperation) right).evaluate(v);
        return getValue();
    }

}
