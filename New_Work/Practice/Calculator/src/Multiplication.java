public class Multiplication implements GetUserValue {

    @Override
    public void calculateDouble(double operand1, double operand2) {

        double multiplication = operand1 * operand2;
        System.out.println("Multiplication = " + multiplication);
    }
}
