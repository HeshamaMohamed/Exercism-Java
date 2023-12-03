class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String message = "";
        if (operation == null) {
                    throw new IllegalArgumentException("Operation cannot be null");
        } else {
            try {
                switch (operation){
                    case "+":
                        message = operand1 + " " + operation + " " + operand2 + " = " + (operand1 + operand2);
                        break;
                    case "/":
                        message = operand1 + " " + operation + " " + operand2 + " = " + (operand1 / operand2);
                        break;
                    case "*":
                        message = operand1 + " " + operation + " " + operand2 + " = " + (operand1 * operand2);
                        break;
                    case "":
                        throw new IllegalArgumentException("Operation cannot be empty");
                    default:
                        throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                    }
                } catch(ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            }

        return message;
    }
}
