package StringQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringInAscendingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();

        input = input.toUpperCase();

        char[] ch = input.toCharArray();

//        Arrays.sort(ch);
//
//        System.out.println(ch);
//        String nstr = new String(ch);
//        System.out.println(nstr);


        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        String str = new String(ch);
        System.out.println(str);
    }
}
