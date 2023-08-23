package Uniqueness;

import java.util.Scanner;

public class UniqueFirstCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int index = 0;
        char nrc = ' ';

        if (str.length() == 0) {
            System.out.println("Empty String");
        }

        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                nrc = i;
                break;
            } else {
                index = index + 1;
            }
        }

        if (index == str.length()) {
            System.out.println("All characters are repeating");
        } else {
            System.out.print("First non-repeating character is : " + nrc);
        }

    }

}
