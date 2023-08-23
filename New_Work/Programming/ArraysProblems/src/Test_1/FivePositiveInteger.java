package Test_1;

import java.util.Arrays;

public class FivePositiveInteger {

    public void findMaxMinValue(int[] ar) {
        Arrays.sort(ar);

        int minimumSum = 0;
        int maximumSum = 0;

        for (int counter = 0; counter < ar.length - 1; counter++) {
            minimumSum = minimumSum + ar[counter];
        }

        for (int counter = 1; counter < ar.length; counter++) {
            maximumSum = maximumSum + ar[counter];
        }

        System.out.println(minimumSum + " " + maximumSum);

    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 7, 1};
        FivePositiveInteger fivePositiveInteger = new FivePositiveInteger();
        fivePositiveInteger.findMaxMinValue(arr);
    }


}
