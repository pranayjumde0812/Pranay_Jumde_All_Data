package Recursion;

public class SumOfPositiveInteger {


    public static void main(String[] args) {

        System.out.println(sumOfPositiveIntegerByRecursion(5874));
        System.out.println(powerOfNumberRecursion(10, 5));
    }

    public static int sumOfPositiveIntegerByRecursion(int num) {

        if (num < 0) {
            return -1;
        }

        if (num == 0) {
            return num;
        }

        return (num % 10 + sumOfPositiveIntegerByRecursion(num / 10));

    }

    public static int powerOfNumberRecursion(int num, int power) {

        if (power < 0) {
            return -1;
        }

        if (power == 0 || power == 1) {
            return num;
        }

        return (num * powerOfNumberRecursion(num, power - 1));
    }
}
