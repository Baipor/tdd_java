
public class Operand {
    
    private int operand;
    public Operand(int operand) {
        this.operand = operand;
    }
    
    public int getOperand() {
        return this.operand;
    }
    
    public String toString() {
        String [] displayNumbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return displayNumbers[this.operand - 1];
    }

}
