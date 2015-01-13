
public class Captcha {
    private Operator operator;
    private int leftOperand;
    private int pattern;
    private int rightOperand;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.operator = new Operator(operator);
        this.leftOperand = leftOperand;
        this.pattern = pattern;
        this.rightOperand = rightOperand;
    }

    public String getCaptcha() {
        if(isAlphabetOperatorNumberPattern()) {
            return String.format("%s %s %d", getLeftOperand(), operator.toString(), rightOperand);
        }
        return String.format("%d %s %s", leftOperand, operator.toString(), getRightOperand());
    }

    private boolean isAlphabetOperatorNumberPattern() {
        return this.pattern == 1;
    }

    public String getLeftOperand() {
        return getStringOperand(this.leftOperand);
    }

    public String getRightOperand() {
        return getStringOperand(this.rightOperand);
    }

    private String getStringOperand(int operand) {
        String [] displayNumbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return displayNumbers[operand - 1];
    }

    public String getOperator() {
        return this.operator.toString();
    }
}
