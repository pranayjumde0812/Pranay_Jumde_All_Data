public class RecursivePrimeNumber {

    public static void main(String[] args) {
        int lastNumber = 100;

        RecursivePrimeNumber rpn = new RecursivePrimeNumber();

        for (int i = 0; i <= lastNumber; i++) {
            if (rpn.isPrime(i, 2)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int number, int divisor) {

        if (number <= 2) {
            return number == 2;
        }

        if (number % divisor == 0) {
            return false;
        }

        if (divisor * divisor > number) {
            return true;
        }

        return isPrime(number, divisor + 1);
    }
}
