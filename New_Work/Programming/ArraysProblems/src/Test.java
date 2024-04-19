import java.util.Scanner;

class Test {

    public static void main(String[] args) {

        System.out.println("Enter size");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[0];

        if ((N >= 1 && N <= 100) && (N % 2 != 0)) {
            arr = new int[N];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);

    }
}
