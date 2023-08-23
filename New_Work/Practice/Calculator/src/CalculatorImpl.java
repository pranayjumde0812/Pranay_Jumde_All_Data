public class CalculatorImpl {

    public void calculateOperator(String operator, double operand1 , double operand2){

        switch (operator){

            case "+" :
                Addition addition = new Addition();
                addition.calculateDouble(operand1,operand2);
                break;

            case "-" :
                Substraction substraction = new Substraction();
                substraction.calculateDouble(operand1,operand2);
                break;

            case "*" :
                Multiplication multiplication = new Multiplication();
                multiplication.calculateDouble(operand1,operand2);
                break;

            case "/" :
                Division division = new Division();
                division.calculateDouble(operand1,operand2);
                break;
        }
    }


}
