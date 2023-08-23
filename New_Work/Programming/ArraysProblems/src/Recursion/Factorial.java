package Recursion;

public class Factorial {

    public static void main(String[] args) {

        long result = factorialRecursive(5);

        System.out.println(result);
    }

    public static long factorialRecursive(int n) {

        /*

          n! = n * (n-1) * ( n-2) * … * 2 * 1
                                               = (n-1)!

          (n-1)! = (n-1) * (n-1-1) * (n-1-2) * … * 2 * 1 = (n-1) * (n-2) * (n-3) * … * 2 * 1

         */

        if (n < 0) {        // constraint condition for negative value
            return -1;
        }

        if (n == 0 || n == 1) {       // condition for 0! & 1! because both answer is 1. This is end condition
            return 1;
        }

        return n * factorialRecursive(n - 1);     // main return condition
    }
}
