package StringQuestions;

import java.util.Scanner;

public class ConvertStringToLowerCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();

        char[] ch = input.toCharArray();
        String str = "";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                str = str + (char) (ch[i] + 32);
            } else {
                str = str + ch[i];
            }
        }
        System.out.println(str);
    }
}
