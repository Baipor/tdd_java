public class Pattern2 {
    
    private Operator operator;
    private Operand leftOperand;
    private Operand rightOperand;
    
    public Pattern2(Operand leftOperand, Operator operator, Operand rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public String toString() {
        return String.format("%d %s %s", this.leftOperand.getOperand(), this.operator.toString(), this.rightOperand);
    }

}