package Test_1;

public class ReadThirdElementArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        ReadThirdElementArray readThirdElementArray = new ReadThirdElementArray();
        int sum = readThirdElementArray.readThirdElement(arr);
        System.out.println(sum);
    }

    public int readThirdElement(int[] arr) {
        int sum = 0;

        for (int counter = 0; counter <= arr.length - 1; counter = counter + 3) {
//            sum = sum + counter * counter;
            sum = sum + arr[counter]*arr[counter];
        }
        return sum;
    }
}
