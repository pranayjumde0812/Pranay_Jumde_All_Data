package StringQuestions;

import java.util.Scanner;

public class ReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
/////////////////////////////////////////////////////////////////////
        StringBuffer str = new StringBuffer(input);
        str.reverse();
        System.out.println(str);

/////////////////////////////////////////////////////////////////////
        char ch[] = input.toCharArray();

        for (int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }
        String nstr = new String(ch);
        System.out.println(nstr);


    }
}
