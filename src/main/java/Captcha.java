import java.util.ArrayList;
import java.util.List;

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
        return format();
    }

    private String format() {
        List<Pattern> patterns = new ArrayList<Pattern>();
        patterns.add(new Pattern1(leftOperand, operator, rightOperand));
        patterns.add(new Pattern2(leftOperand, operator, rightOperand));
        for (Pattern pattern : patterns) {
            if(pattern.isValidPattern(this.pattern)) {
                return pattern.toString();
            }
        }
        return null;
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
