package Recursion;

public class FibonacciRecursive {

    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {

        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
