package StringQuestions;

import java.util.Scanner;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String input = sc.nextLine();

        char[] ch = input.toCharArray();

        StringBuilder str = new StringBuilder();

        for (char c : ch) {
            if (c >= 97 && c <= 122) {
                str.append((char) (c - 32));
            } else {
                str.append(c);
            }
        }
        System.out.println(str);
    }
}
