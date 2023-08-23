package SpecialSum;

import java.util.Scanner;

public class SpecialSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements in array");
        for (int input = 0; input < arr.length; input++) {
            arr[input] = sc.nextInt();
        }

        System.out.println("Enter the 'k' number: ");
        int k = sc.nextInt();

        SpecialSum specialSum = new SpecialSum();

        int sum = specialSum.findSpecialSum(arr, k);

        System.out.println("The Sum of special case is : " + sum);
    }

    public int findSpecialSum(int[] arr, int k) {

        int sum = 0;
        for (int index = 0; index < arr.length; index++) {

            int count = findCountOfSameElementInArray(arr, arr[index]);

            if (count >= k) {
                sum = sum + arr[index];
            }
        }
        return sum;
    }

    public int findCountOfSameElementInArray(int[] arr, int element) {

        int count = 0;
        for (int in = 0; in < arr.length; in++) {
            if (arr[in] == element) {
                count = count + 1;
            }
        }
        return count;
    }
}
