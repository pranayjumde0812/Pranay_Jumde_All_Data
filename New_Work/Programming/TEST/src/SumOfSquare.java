import java.util.Scanner;

public class SumOfSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        SumOfSquare sos = new SumOfSquare();

        int sum = sos.calculateSumOfSquares(number);

        System.out.println(sum);
    }

    private int calculateSumOfSquares(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }
}
