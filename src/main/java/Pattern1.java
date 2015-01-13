public class Pattern1 {
    
    private Operator operator;
    private Operand leftOperand;
    private Operand rightOperand;
    
    public Pattern1(Operand leftOperand, Operator operator, Operand rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public String toString() {
        return String.format("%s %s %d", this.leftOperand.toString(), this.operator.toString(), this.rightOperand.getOperand());
    }

}