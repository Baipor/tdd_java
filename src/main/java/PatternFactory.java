import java.util.ArrayList;
import java.util.List;

public class PatternFactory {

    private PatternFactory() {
    }

    public static List<Pattern> create(int leftOperand, int operator, int rightOperand) {
        List<Pattern> patterns = new ArrayList<Pattern>();
        patterns.add(new Pattern1(new Operand(leftOperand), new Operator(operator), new Operand(rightOperand)));
        patterns.add(new Pattern2(new Operand(leftOperand), new Operator(operator), new Operand(rightOperand)));
        return patterns;
    }

}
