public class Pattern {

    protected Operator operator;
    protected Operand leftOperand;
    protected Operand rightOperand;
    
    public Pattern(Operand leftOperand, Operator operator, Operand rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

}