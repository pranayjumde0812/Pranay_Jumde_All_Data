package Code;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean Compare(String s1,String s2)
    {
        boolean check=true;
        int len_s1=s1.length();
        int len_s2=s2.length();
        if(len_s1!=len_s2)
        {
            System.out.println(s1+" and "+s2+" is not anagram of each other");
            System.exit(0);
        }
        else
        {
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();

            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    check=false;
                }
            }

        }
        return check;
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1 :");
        String s1=sc.nextLine();
        System.out.println("Enter the String 2 :");
        String s2=sc.nextLine();
        s1=s1.trim();
        s2=s2.trim();
        System.out.println(s1+ "  "+s2);
        boolean b=Compare(s1,s2);
        if(b==true)
        {
            System.out.println(s1+" and "+s2+" are anagram to each other");
        }
        else
        {
            System.out.println(s1+" and "+s2+" is not anagram of each other");
        }
    }
}
