package Test_2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        boolean result = checkLeapYear(year);

        System.out.println(result);
    }
    private static boolean checkLeapYear(int year) {

        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
