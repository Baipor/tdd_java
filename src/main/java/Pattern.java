abstract public class Pattern {

    protected Operator operator;
    protected Operand leftOperand;
    protected Operand rightOperand;

    public Pattern(Operand leftOperand, Operator operator, Operand rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public Operand getLeftOperand() {
        return leftOperand;
    }

    public Operand getRightOperand() {
        return rightOperand;
    }

    public abstract boolean isValidPattern(int pattern);

}