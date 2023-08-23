package Test_2;

public class RecursivePrimeNumber {

    public static void main(String[] args) {

        int num = 100;

        for (int i = 1; i <= num; i++) {
            if (isPrime(i, 2)) {
                System.out.println("Prime Number is: " + i);
            }
        }
    }

    private static boolean isPrime(int n, int i) {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor

        return isPrime(n, i + 1);
    }

}
