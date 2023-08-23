package Code;

import java.util.Scanner;

public class Note {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the amount (in integer) :");
            int amt=sc.nextInt();
            int total;
            total=amt/500;
            System.out.println("500's notes are : "+total);

            amt=amt-(total*500);
            total=amt/100;
            System.out.println("100's notes are : "+total);

            amt=amt-(total*100);
            total=amt/50;
            System.out.println("50's notes are : "+total);

            amt=amt-(total*50);
            total=amt/20;
            System.out.println("20's notes are : "+total);

            amt=amt-(total*20);
            total=amt/10;
            System.out.println("10's notes are : "+total);
        }
    }

