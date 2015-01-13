public class Captcha {
    private Operator operator;
    private Operand leftOperand;
    private int pattern;
    private Operand rightOperand;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.operator = new Operator(operator);
        this.leftOperand = new Operand(leftOperand);
        this.pattern = pattern;
        this.rightOperand = new Operand(rightOperand);
        ;
    }

    public String getCaptcha() {
        if (isAlphabetOperatorNumberPattern()) {
            return String.format("%s %s %d", getLeftOperand(), operator.toString(), rightOperand.getOperand());
        }
        return String.format("%d %s %s", leftOperand.getOperand(), operator.toString(), getRightOperand());
    }

    private boolean isAlphabetOperatorNumberPattern() {
        return this.pattern == 1;
    }

    public String getLeftOperand() {
        return this.leftOperand.toString();
    }

    public String getRightOperand() {
        return this.rightOperand.toString();
    }

    public String getOperator() {
        return this.operator.toString();
    }
}
