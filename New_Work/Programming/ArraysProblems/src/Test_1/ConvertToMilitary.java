package Test_1;

import java.util.Scanner;

/**
 * This program is to convert AM / PM time to 24 hours of clock
 */

public class ConvertToMilitary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in format : HH:MM:SS AM (or) HH:MM:SS PM");
        String time = sc.nextLine();

        ConvertToMilitary amPm = new ConvertToMilitary();

        amPm.ConvertTo24Hours(time);

    }


    public void ConvertTo24Hours(String time) {
        int h1 = (int) time.charAt(1) - '0';
        int h2 = (int) time.charAt(0) - '0';

        int hh = (h2 * 10 + h1 % 10);

        // IF TIME IS IN AM FORMAT
        if (time.charAt(9) == 'A') {

            if (hh == 12) {
                System.out.print("00");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            } else {
                for (int i = 0; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        }
        // WHEN TIME IS IN PM FORMAT
        else {

            if (hh == 12) {
                for (int i = 0; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            } else {
                hh = hh + 12;

                System.out.print(hh);
                for (int i = 2; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            }

        }

    }
}
