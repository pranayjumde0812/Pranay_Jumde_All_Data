package Test_2;

import java.util.Scanner;

public class SquareNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum = findSquareOfNumbers(n);

        System.out.println(sum);
    }

    private static int findSquareOfNumbers(int n) {

        int sum = 0, square;

        for (int i = 1; i <= n; i++) {
            square = i * i;
            sum = sum + square;
        }

        return sum;
    }
}
