package StringQuestions;

import java.util.Scanner;

/*
    Write a program for a number of characters in each word and count them
    OR
    Write a program to count number of characters in each word ?
 */
public class CountNumberOfCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String input = sc.nextLine();

        String str = "";
        int count = 0;

        for (int i = 0 ; i < input.length() ; i++){
            if(input.charAt(i) == ' '){
                str = str +" = " +count+" ";
                count = 0;
            }else{
                count++;
                str = str + input.charAt(i);
            }
        }
          str = str +" = "+ count;
        System.out.println("Character count : "+str);
    }
}
