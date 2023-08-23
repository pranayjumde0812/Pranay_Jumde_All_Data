public class Division implements GetUserValue {

    @Override
    public void calculateDouble(double operand1, double operand2) {

        double division = operand1 / operand2;
        System.out.println("Division = " + division);
    }
}
