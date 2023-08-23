package StringQuestions;

import java.util.Scanner;

public class CountOccuranceOfCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = sc.next();

        int n = input.length();
        char[] ch = input.toCharArray();

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    int k = j;
                    while (k < n - 1) {
                        ch[k] = ch[k + 1];
                        k++;
                    }
                    n--;
                    j--;
                }
            }
            System.out.println("The character " + ch[i] + " occurred for " + count + " times.");
        }

        String str = "";
        for (int c = 0 ; c < n ; c++) {
            str = str + ch[c];
        }
        System.out.println(str);
    }
}
