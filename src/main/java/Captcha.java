import java.util.ArrayList;
import java.util.List;

public class Captcha {
    private Operator operator;
    private Operand leftOperand;
    private int pattern;
    private Operand rightOperand;

    List<Pattern> patterns;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.operator = new Operator(operator);
        this.leftOperand = new Operand(leftOperand);
        this.pattern = pattern;
        this.rightOperand = new Operand(rightOperand);

        createPatterns();
    }

    public void createPatterns() {
        patterns = new ArrayList<Pattern>();
        patterns.add(new Pattern1(leftOperand, operator, rightOperand));
        patterns.add(new Pattern2(leftOperand, operator, rightOperand));
    }

    public String getCaptcha() {
        return format();
    }

    private String format() {
        for (Pattern pattern : patterns) {
            if (pattern.isValidPattern(this.pattern)) {
                return pattern.toString();
            }
        }
        return null;
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
