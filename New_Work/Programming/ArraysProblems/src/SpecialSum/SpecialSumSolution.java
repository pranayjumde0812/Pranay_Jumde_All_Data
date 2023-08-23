package SpecialSum;

import java.util.Scanner;

public class SpecialSumSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: n = ");
        int n = sc.nextInt();
        if (n >= 1 && n <= 100000) {
        } else {
            System.out.println("Please enter the size of an array within the range of 1 to 100000");
            System.exit(0);
        }
        int[] a = new int[n];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp >= 1 && temp <= 1000) {
                a[i] = temp;
            } else {
                System.out.println("Invalid element");
                System.out.println("Please enter the element within the range of 1 to 1000");
                System.exit(0);
            }
        }
        System.out.print("Enter the 'k' integer: ");
        int k = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            int count = search(a, a[i]);
            if (count >= k) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }

      static int search(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
//                count = count + 1;
                count++;
            }
        }
        return count;
      }
}
