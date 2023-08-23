import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CalculatorImpl calculator = new CalculatorImpl();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter first number = ");
        double operand1 = sc.nextDouble();

        System.out.print("Please enter first number = ");
        double operand2 = sc.nextDouble();

        System.out.print("Please select the operator from following : [ + , - , * , / ] = ");
        String operator = sc.next();

        double result = calculator.calculateOperator(operator,operand1,operand2);

        System.out.println("The operation performed: "+operand1+" "+operator+" "+operand2 +" = "+result);

    }
}