public class Pattern2 extends Pattern{

    public Pattern2(Operand leftOperand, Operator operator, Operand rightOperand) {
        super(leftOperand, operator, rightOperand);
    }

    public String toString() {
        return String.format("%d %s %s", this.leftOperand.getOperand(), this.operator.toString(), this.rightOperand);
    }

}