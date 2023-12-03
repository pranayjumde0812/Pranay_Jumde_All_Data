package Classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        char[] ch = sentence.toCharArray();

        String str = "";

        String[] strings = sentence.split(" ");
        for (String sstr : strings) {
            System.out.print(sstr + ",");
        }
        System.out.println();

        List<String> listOfString = Arrays.asList(strings);

        System.out.println(listOfString);

    }
}
