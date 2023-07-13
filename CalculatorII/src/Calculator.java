import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
    private Deque<Double> operands;
    private Deque<String> operations;
    private double result;

    public Calculator() {
        operands = new ArrayDeque<>();
        operations = new ArrayDeque<>();
    }

    public void performOperation(double operand) {
        operands.push(operand);
    }

    public void performOperation(String operation) {
        if (operation.equals("=")) {
            while (!operations.isEmpty()) {
                calculate();
            }
        } else {
            if (!operations.isEmpty() && !operation.equals("*") && !operation.equals("/")) {
                while (!operations.isEmpty() && !operations.peek().equals("=")) {
                    calculate();
                }
            }
            operations.push(operation);
        }
    }

    private void calculate() {
        if (operands.size() < 2 || operations.isEmpty()) {
            throw new IllegalStateException("Insufficient operands or operations");
        }

        double operand2 = operands.pop();
        double operand1 = operands.pop();
        String operation = operations.pop();

        switch (operation) {
            case "+":
                operands.push(operand1 + operand2);
                break;
            case "-":
                operands.push(operand1 - operand2);
                break;
            case "*":
                operands.push(operand1 * operand2);
                break;
            case "/":
                operands.push(operand1 / operand2);
                break;
        }
    }

    public void calculateResult() {
        while (!operations.isEmpty()) {
            calculate();
        }

        if (operands.size() != 1) {
            throw new IllegalStateException("Invalid expression");
        }

        result = operands.pop();
    }

    public double getResults() {
        return result;
    }
}