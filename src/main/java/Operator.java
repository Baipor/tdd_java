public class Operator {
    private int operator;
    
    public Operator(int operator) {
        this.operator = operator;
    }
    public String toString() {
        String[] operatorList = { "+", "*", "-" };
        return operatorList[this.operator - 1];
    }
}
