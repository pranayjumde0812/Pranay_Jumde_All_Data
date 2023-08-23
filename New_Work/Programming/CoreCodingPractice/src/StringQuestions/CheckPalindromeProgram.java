package StringQuestions;

import java.util.Scanner;

public class CheckPalindromeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String input = sc.next();

        String result = checkForPalindrome(input);
        if (input.equalsIgnoreCase(result)) {
            System.out.println("Given String is palindrome");
        } else
            System.out.println("Given string is not palindrome");
    }

    static String checkForPalindrome(String input) {

        String reverse = "";

        char[] ch = input.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            reverse = reverse + ch[i];
        }
        return reverse;
    }
}
