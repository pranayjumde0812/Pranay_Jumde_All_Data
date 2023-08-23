public class Substraction implements GetUserValue {

    @Override
    public void calculateDouble(double operand1, double operand2) {

        double subtraction = operand1 - operand2;
        System.out.println("Subtraction = " + subtraction);
    }
}
