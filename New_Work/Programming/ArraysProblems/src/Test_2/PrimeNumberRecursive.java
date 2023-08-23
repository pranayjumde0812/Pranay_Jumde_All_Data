package Test_2;

public class PrimeNumberRecursive {

    public static void main(String[] args) {
        int num = 100;

        for (int i = 1; i <= num; i++) {
            if (isPrimeNumber(i, 2)) {
                System.out.println("Is Prime number: " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int number, int divisor) {

        if (number <= 2) {
            return number == 2;
        }

        if (number % divisor == 0)
            return false;

        if (divisor * divisor > number)
            return true;

        return isPrimeNumber(number, divisor + 1);
    }
}
