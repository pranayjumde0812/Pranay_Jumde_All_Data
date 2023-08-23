public class Addition implements GetUserValue {

    @Override
    public void calculateDouble(double operand1, double operand2) {

        double addition = operand1 + operand2;
        System.out.println("Addition = " + addition);
    }
}
