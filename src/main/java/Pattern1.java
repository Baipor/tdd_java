public class Pattern1 extends Pattern {

    public Pattern1(Operand leftOperand, Operator operator, Operand rightOperand) {
        super(leftOperand, operator, rightOperand);
    }

    public String toString() {
        return String.format("%s %s %d", this.leftOperand.toString(), this.operator.toString(), this.rightOperand.getOperand());
    }

}