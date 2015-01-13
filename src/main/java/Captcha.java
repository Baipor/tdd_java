
public class Captcha {
    private int operator;
    private int leftOperand;
    private int rightOperand;
    private int pattern;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.pattern = pattern;
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public String getCaptcha() {
        return getPattern().toString();
    }

    private Pattern getPattern() {
        for (Pattern pattern : PatternFactory.create(leftOperand, operator, rightOperand)) {
            if (pattern.isValidPattern(this.pattern)) {
                return pattern;
            }
        }
        return null;
    }

    public String getLeftOperand() {
        return getPattern().getLeftOperand().toString();
    }

    public String getRightOperand() {
        return getPattern().getRightOperand().toString();
    }

    public String getOperator() {
        return getPattern().getOperator().toString();
    }
}
