package StringQuestions;

import java.util.Scanner;


/*
Calculate the sum of digits present in given string
Also 1) count of digits and 2) Return string after removal of digits.
 */
public class SumOfDigitsInString {

    static int sumOfDigits;
    static int countOfDigits;

    static String afterRemovalDigits = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = sc.next();

        char[] ch = input.toCharArray();

        for (char c : ch) {
            if (c >= 48 && c <= 57) {
                sumOfDigits = sumOfDigits + (c - 48);
                countOfDigits++;
            } else {
                afterRemovalDigits = afterRemovalDigits + c;
            }
        }


        System.out.printf("Sum of digits         %d \n", sumOfDigits);
        System.out.printf("Count of digits       %d \n", countOfDigits);
        System.out.printf("String after remove   %s ", afterRemovalDigits);
    }
}
