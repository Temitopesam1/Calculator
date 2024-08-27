public class Present {
    private double[] input;
    private char operator;

    public Present(char operator, double... input) {
        setOperator(operator);
        setInput(input);
    }

    public void setInput(double... input) {
        this.input = input;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double[] getInput() {
        return input;
    }

    public char getOperator() {
        return operator;
    }
}
