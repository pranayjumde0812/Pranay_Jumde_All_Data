public class CalculatorImpl {

    public double calculateOperator(String operator, double operand1, double operand2) {

        switch (operator) {

            case "+":
                Addition addition = new Addition();
                double sum = addition.calculateDouble(operand1, operand2);
                return sum;
//              break;

            case "-":
                Subtraction subtraction = new Subtraction();
                double sub = subtraction.calculateDouble(operand1, operand2);
                return sub;
//                break;

            case "*":
                Multiplication multiplication = new Multiplication();
                double mul = multiplication.calculateDouble(operand1, operand2);
                return mul;
//                break;

            case "/":
                Division division = new Division();
                double div = division.calculateDouble(operand1, operand2);
                return div;
//                break;
        }

        return 0.0;

    }
}
