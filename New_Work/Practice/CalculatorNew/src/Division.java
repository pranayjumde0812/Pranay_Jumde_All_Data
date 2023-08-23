public class Division implements GetUserValue {

    @Override
    public double calculateDouble(double operand1, double operand2) {

        double division = operand1 / operand2;
        return division;
    }
}
