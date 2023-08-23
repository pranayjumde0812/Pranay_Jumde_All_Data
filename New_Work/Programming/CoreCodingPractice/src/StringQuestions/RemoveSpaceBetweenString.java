package StringQuestions;

import java.util.Scanner;

public class RemoveSpaceBetweenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String input = sc.nextLine();

        char[] ch = input.toCharArray();

        String str = "";

        for (char i : ch) {
            if (i != ' ') {
                str = str + i;
            }
        }
        System.out.println(str);
    }
}
