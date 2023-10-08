package CalculateEarningOfDoc;

import java.util.Scanner;

public class CalculateEarning {

    public static int calculateEarning(int[] arr) {

        int dailyEarning = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 17) {
                dailyEarning += 200;
            } else if (arr[i] >= 17 && arr[i] <= 40) {
                dailyEarning += 400;
            } else {
                dailyEarning += 300;
            }
        }
        return dailyEarning;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Doctor treat 20 patients per day

        int[] agesOfPatients = new int[20];

        // Inputs of ages
        System.out.println("enter age greater than 0 and less than 120");
        for (int i = 0; i < agesOfPatients.length; i++) {
            agesOfPatients[i] = sc.nextInt();
        }

        int earningADay = calculateEarning(agesOfPatients);

        System.out.println(earningADay);

    }
}
